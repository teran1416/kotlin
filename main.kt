package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var Numero1: EditText
    lateinit var Numero2: EditText
    lateinit var CampoResultado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enlace = ActivityMainBinding.inflate(layoutInflater)
        setContentView(enlace.root)

        Numero1 = enlace.EditNumero1
        Numero2 = enlace.EditNumero2
        CampoResultado = enlace.campoResultado


        }
    fun sumar(view: View){
        val suma = Numero1.text.toString().toFloat()+Numero2.text.toString().toFloat()
        CampoResultado.setText(suma.toString())

    }
    }
