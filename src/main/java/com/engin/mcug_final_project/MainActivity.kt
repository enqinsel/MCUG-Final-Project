package com.engin.mcug_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = findViewById<TextView>(R.id.counter)

        var sayac = object : CountDownTimer(6000,1000){
            override fun onTick(p0: Long) {
                counter.text = (p0/1000).toString()
            }

            override fun onFinish() {
                val intent = Intent(applicationContext, login::class.java)
                startActivity(intent)
            }

        }
        sayac.start()


    }
}