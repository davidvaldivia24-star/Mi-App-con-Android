package com.example.miprimeraaplicacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraaplicacion.databinding.ActivityLocalizacionBinding

class LocalizacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocalizacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocalizacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}