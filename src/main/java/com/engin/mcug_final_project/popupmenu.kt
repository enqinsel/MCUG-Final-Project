package com.engin.mcug_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.os.HandlerCompat.postDelayed
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class popupmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupmenu)

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

        var cikisyap = findViewById<FloatingActionButton>(R.id.cikisyap)
        cikisyap.setOnClickListener {
            Snackbar.make(it, "Uygulamadan Çıkılıyor", Snackbar.LENGTH_SHORT).show()
            Handler().postDelayed({
                moveTaskToBack(true);       // İnternetten Bulundu
                android.os.Process.killProcess(android.os.Process.myPid());
            }, 3000)
    }

            //cikisyap.setOnClickListener { moveTaskToBack(true);
             //   android.os.Process.killProcess(android.os.Process.myPid()); }
        }

    }
