package com.engin.mcug_final_project

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

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

        var renkMenu = findViewById<Button>(R.id.renkMenu)
        renkMenu.setOnClickListener {
            val colormenu = PopupMenu(this, renkMenu)
            colormenu.menuInflater.inflate(R.menu.colors, colormenu.menu)
            colormenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.elektrikmavisi -> {
                        var namefield = findViewById<TextView>(R.id.namefield)
                        namefield.setTextColor(Color.parseColor("#7DF9FF"))
                        true
                    }
                    R.id.naneyesili -> {
                        var namefield = findViewById<TextView>(R.id.namefield)
                        namefield.setTextColor(Color.parseColor("#98FF98"))
                        true
                    }
                    R.id.gulrengi -> {
                        var namefield = findViewById<TextView>(R.id.namefield)
                        namefield.setTextColor(Color.parseColor("#FF007F"))
                        true
                    }
                    R.id.ilkbaharyesili -> {
                        var namefield = findViewById<TextView>(R.id.namefield)
                        namefield.setTextColor(Color.parseColor("#00FF7F"))
                        true
                    }
                    R.id.narcicegi -> {
                        var namefield = findViewById<TextView>(R.id.namefield)
                        namefield.setTextColor(Color.parseColor("#E32636"))
                        true
                    }
                    else -> false
                }

            }
            colormenu.show()
            }

        var arkaPlanMenu = findViewById<Button>(R.id.arkaPlanMenu)
        arkaPlanMenu.setOnClickListener {
            val colormenu = PopupMenu(this, arkaPlanMenu)
            colormenu.menuInflater.inflate(R.menu.colors, colormenu.menu)
            colormenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.elektrikmavisi -> {
                        var bgyazi = findViewById<View>(R.id.bgyazi)
                        bgyazi.setBackgroundColor(Color.parseColor("#7DF9FF"))
                        true
                    }
                    R.id.naneyesili -> {
                        var bgyazi = findViewById<View>(R.id.bgyazi)
                        bgyazi.setBackgroundColor(Color.parseColor("#98FF98"))
                        true
                    }
                    R.id.gulrengi -> {
                        var bgyazi = findViewById<View>(R.id.bgyazi)
                        bgyazi.setBackgroundColor(Color.parseColor("#FF007F"))
                        true
                    }
                    R.id.ilkbaharyesili -> {
                        var bgyazi = findViewById<View>(R.id.bgyazi)
                        bgyazi.setBackgroundColor(Color.parseColor("#00FF7F"))
                        true
                    }
                    R.id.narcicegi -> {
                        var bgyazi = findViewById<View>(R.id.bgyazi)
                        bgyazi.setBackgroundColor(Color.parseColor("#E32636"))
                        true
                    }
                    else -> false
                }

            }
            colormenu.show()
        }

        var fragmentarkaPlanMenu = findViewById<Button>(R.id.fragmentarkaPlanMenu)
        fragmentarkaPlanMenu.setOnClickListener {
            val colormenu = PopupMenu(this, fragmentarkaPlanMenu)
            colormenu.menuInflater.inflate(R.menu.colors, colormenu.menu)
            colormenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.elektrikmavisi -> {
                        var fragmentfield = findViewById<View>(R.id.fragmentfield)
                        fragmentfield.setBackgroundColor(Color.parseColor("#7DF9FF"))
                        true
                    }
                    R.id.naneyesili -> {
                        var fragmentfield = findViewById<View>(R.id.fragmentfield)
                        fragmentfield.setBackgroundColor(Color.parseColor("#98FF98"))
                        true
                    }
                    R.id.gulrengi -> {
                        var fragmentfield = findViewById<View>(R.id.fragmentfield)
                        fragmentfield.setBackgroundColor(Color.parseColor("#FF007F"))
                        true
                    }
                    R.id.ilkbaharyesili -> {
                        var fragmentfield = findViewById<View>(R.id.fragmentfield)
                        fragmentfield.setBackgroundColor(Color.parseColor("#00FF7F"))
                        true
                    }
                    R.id.narcicegi -> {
                        var fragmentfield = findViewById<View>(R.id.fragmentfield)
                        fragmentfield.setBackgroundColor(Color.parseColor("#E32636"))
                        true
                    }
                    else -> false
                }

            }
            colormenu.show()
        }
        }
}