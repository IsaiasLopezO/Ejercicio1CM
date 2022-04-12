package com.example.ejercicio1cm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        //tvSaludo.text =  "Hola Isaias"

        btnSaludar.setOnClickListener{
            tvSaludo.text =  "Hola Isaias"
        }

        tvSaludo.setOnClickListener{
            tvSaludo.text = "Hola Karen"
        }
    }
}