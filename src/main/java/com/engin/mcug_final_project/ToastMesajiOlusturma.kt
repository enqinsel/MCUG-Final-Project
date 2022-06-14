package com.engin.mcug_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class ToastMesajiOlusturma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_mesaji_olusturma)

        var menu = findViewById<Button>(R.id.menu)
        menu.setOnClickListener {
            val acilirmenu = PopupMenu(this, menu)
            acilirmenu.menuInflater.inflate(R.menu.popupmenu, acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.anasayfa -> { val intent = Intent(applicationContext, popupmenu::class.java)
                        startActivity(intent); true}
                    R.id.renkler -> {
                        val intent = Intent(applicationContext, Colors::class.java)
                        startActivity(intent); true
                    }
                    R.id.birazhareket -> { val intent = Intent(applicationContext, BirazHareket::class.java)
                        startActivity(intent);
                        true}
                    R.id.gorunurgorunmez -> { val intent = Intent(applicationContext, GorunurGorunmez::class.java)
                        startActivity(intent);
                        true}
                    R.id.toastmesajiolusturma -> { val intent = Intent(applicationContext, ToastMesajiOlusturma::class.java)
                        startActivity(intent);
                        true}
                    else -> false
                }
            }
            acilirmenu.show()
        }

        var radiobutton1 = findViewById<RadioButton>(R.id.radioButton1)
        var radiobutton2 = findViewById<RadioButton>(R.id.radioButton2)
        var radiobutton3 = findViewById<RadioButton>(R.id.radioButton3)
        var radiobutton4 = findViewById<RadioButton>(R.id.radioButton4)
        var toastbuton = findViewById<Button>(R.id.toastbuton)
        

        radiobutton1.setOnCheckedChangeListener { radioGroup, isChecked ->
            if(isChecked){
                toastbuton.setOnClickListener {
                    val tasarim = layoutInflater.inflate(R.layout.toast1,null)
                    val ad = AlertDialog.Builder(this@ToastMesajiOlusturma)
                    ad.setView(tasarim)
                    ad.create().show()
//                    var nametoast = findViewById<EditText>(R.id.nametoast)
//                    var isimtext1 = findViewById<TextView>(R.id.isimtext1)
//                    var kaydedilen = nametoast.text.toString()
//                    isimtext1.text = kaydedilen

            }
            }

        }


        radiobutton2.setOnCheckedChangeListener { radioGroup, isChecked ->
            if(isChecked){
                toastbuton.setOnClickListener {
                    val tasarim = layoutInflater.inflate(R.layout.toast2,null)
                    val ad = AlertDialog.Builder(this@ToastMesajiOlusturma)
                    ad.setView(tasarim)
                    ad.create().show()
                }
            }

        }

        radiobutton3.setOnCheckedChangeListener { radioGroup, isChecked ->
            if(isChecked){
                toastbuton.setOnClickListener {
                    val tasarim = layoutInflater.inflate(R.layout.toast3,null)
                    val ad = AlertDialog.Builder(this@ToastMesajiOlusturma)
                    ad.setView(tasarim)
                    ad.create().show()
                }
            }

        }

        radiobutton4.setOnCheckedChangeListener { radioGroup, isChecked ->
            if(isChecked){
                toastbuton.setOnClickListener {
                    val tasarim = layoutInflater.inflate(R.layout.toast4,null)
                    val ad = AlertDialog.Builder(this@ToastMesajiOlusturma)
                    ad.setView(tasarim)
                    ad.create().show()
                }
            }

        }
    }

}