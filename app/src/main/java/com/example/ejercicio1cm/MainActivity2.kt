package com.example.ejercicio1cm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSaludar: Button
    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnSaludar = findViewById(R.id.btnSaludar)
        tvSaludo = findViewById(R.id.tvSaludo)

        btnSaludar.setOnClickListener(this)
        tvSaludo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSaludar -> {
                tvSaludo.text = "Hola Isaias 2"
            }

            R.id.tvSaludo -> {
                tvSaludo.text = "Hola Karen 2"

            }
        }
    }
}