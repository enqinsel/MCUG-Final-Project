package com.engin.mcug_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.*
import androidx.appcompat.app.AlertDialog

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var girisyap = findViewById<Button>(R.id.girisyap)
        girisyap.setOnClickListener {
            var numara = findViewById<EditText>(R.id.numara)
            var name = findViewById<EditText>(R.id.name)

            val isim = "Engin İnsel"
            val number = "02180001508"

            if(name.text.isEmpty() == true && numara.text.isEmpty() == true){
                Toast.makeText(applicationContext, "Alanlar Boş Bırakılamaz", Toast.LENGTH_SHORT).show()
                true
            }
            else if (name.text.isEmpty() == true){
                Toast.makeText(applicationContext, "İsim Boş Bırakılamaz", Toast.LENGTH_SHORT).show()
                true
            }
            else if (numara.text.isEmpty() == true){
                Toast.makeText(applicationContext, "Şifre Boş Bırakılamaz", Toast.LENGTH_SHORT).show()
                true
            }
            else if(isim != name.text.toString() || number != numara.text.toString()){
               Toast.makeText(applicationContext, "İsim veya Numara Uyuşmuyor", Toast.LENGTH_SHORT).show()
                true
            }
            else{
                val tasarim = layoutInflater.inflate(R.layout.alert,null)
                val bekle = tasarim.findViewById<TextView>(R.id.counter2)
                val ad = AlertDialog.Builder(this@login)
                ad.setView(tasarim)
                var sayac2 = object : CountDownTimer(4000,1000){
                    override fun onTick(p0: Long) {
                        bekle.text = (p0/1000).toString()
                    }

                    override fun onFinish() {
                        val intent = Intent(applicationContext, popupmenu::class.java)
                        startActivity(intent)
                    }

                }
                sayac2.start()
                ad.create().show()
            }

        }
    }
}