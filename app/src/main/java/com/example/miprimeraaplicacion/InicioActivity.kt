package com.example.miprimeraaplicacion

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraaplicacion.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    // Launcher para recibir datos de vuelta de la Activity Contacto
    private val contactoLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val nombre = data?.getStringExtra("RESPUESTA_NOMBRE")
            val email = data?.getStringExtra("RESPUESTA_EMAIL")

            binding.tvDatosContacto.text = "Datos recibidos:\nNombre: $nombre\nEmail: $email"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recuperar nombre de usuario del Login
        val usuario = intent.getStringExtra("EXTRA_USUARIO")
        binding.tvBienvenida.text = "¡Bienvenido, $usuario!"

        // Botón Contacto (espera respuesta)
        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            contactoLauncher.launch(intent)
        }

        // Botón Sobre Nosotros
        binding.btnSobreNosotros.setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        // Botón Localización
        binding.btnLocalizacion.setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }
}