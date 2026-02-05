package com.example.miprimeraaplicacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraaplicacion.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí no hay lógica extra, solo contenido estático
    }
}