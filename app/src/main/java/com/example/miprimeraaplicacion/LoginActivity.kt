package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraaplicacion.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // Declaramos el binding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Utilizamos inflate para cargar el layout
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar botón
        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUsuario.text.toString()
            val password = binding.etPassword.text.toString()

            if (usuario.isNotEmpty() && password.isNotEmpty()) {
                // Navegar a Activity 2 enviando el nombre
                val intent = Intent(this, InicioActivity::class.java)
                intent.putExtra("EXTRA_USUARIO", usuario)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor complete los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}