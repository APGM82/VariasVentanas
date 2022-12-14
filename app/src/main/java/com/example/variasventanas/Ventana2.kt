package com.example.variasventanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasventanas.databinding.ActivityVentana2Binding

class Ventana2 : AppCompatActivity() {
    lateinit var binding: ActivityVentana2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVentana2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var nom=intent.getStringExtra("nombre")
        var eda=intent.getStringExtra("edad")
        binding.txtcaja2.text=nom
        binding.txtcaja.text=eda
        binding.btnVolver.setOnClickListener{
            finish()
        }

    }
}