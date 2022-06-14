package com.engin.mcug_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class GorunurGorunmez : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gorunur_gorunmez)

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

        var leftbuton = findViewById<Button>(R.id.leftbuton)
        var rightbuton = findViewById<Button>(R.id.rightbuton)

        var lefttext = findViewById<TextView>(R.id.lefttext)
        var righttext = findViewById<TextView>(R.id.righttext)

        var leftradio = findViewById<RadioButton>(R.id.leftradio)
        var rightradio = findViewById<RadioButton>(R.id.rightradio)

        var leftcheck = findViewById<CheckBox>(R.id.leftcheck)
        var rightcheck = findViewById<CheckBox>(R.id.rightcheck)

        fun showHide(view:View) {
            view.visibility = if (view.visibility == View.VISIBLE){
                View.INVISIBLE
            } else{
                View.VISIBLE
            }
        }

        leftbuton.setOnClickListener {
            showHide(rightbuton)
        }
        rightbuton.setOnClickListener {
            showHide(leftbuton)
        }


        lefttext.setOnClickListener {
            showHide(righttext)
        }
        righttext.setOnClickListener {
            showHide(lefttext)
        }


        leftradio.setOnClickListener {
            showHide(rightradio)
        }
        rightradio.setOnClickListener {
            showHide(leftradio)
        }


        leftcheck.setOnClickListener {
            showHide(rightcheck)
        }
        rightcheck.setOnClickListener {
            showHide(leftcheck)
        }
    }
}