package com.engin.mcug_final_project



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu



import androidx.appcompat.app.AppCompatActivity



class BirazHareket : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biraz_hareket)


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


    }


}