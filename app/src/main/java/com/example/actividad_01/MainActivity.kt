package com.example.actividad_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button2)// Referencia del boton
        val text = findViewById<TextView>(R.id.textView2) // Referencia del texto

        //Llamamos al evento de click del boton
        boton.setOnClickListener{

            text.text = "HOLA KOTLIN" // El texto cuando presionamos el boton
            boton.text = "Boton presionado" // Cambio de texto del boton cuaando se lo presiona

        }
    }
}