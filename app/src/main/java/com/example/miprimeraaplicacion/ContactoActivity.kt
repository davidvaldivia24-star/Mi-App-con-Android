package com.example.miprimeraaplicacion

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraaplicacion.databinding.ActivityContactoBinding

class ContactoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val email = binding.etEmail.text.toString()

            // Preparamos el intent de respuesta
            val resultIntent = Intent()
            resultIntent.putExtra("RESPUESTA_NOMBRE", nombre)
            resultIntent.putExtra("RESPUESTA_EMAIL", email)

            // Establecemos el resultado como OK y pasamos los datos
            setResult(Activity.RESULT_OK, resultIntent)

            // Cerramos la actividad para volver atrás
            finish()
        }
    }
}