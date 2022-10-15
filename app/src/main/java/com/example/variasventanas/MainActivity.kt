package com.example.variasventanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasventanas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            var inte: Intent = Intent(this,Ventana2::class.java)//
            inte.putExtra("nombre",binding.txtTexto1.text.toString())
            inte.putExtra("edad",binding.txtTexto2.text.toString())
            startActivity(inte)
        }
        //reiniciar
        binding.button2.setOnClickListener{
            var ine:Intent=intent
            finish()
            startActivity(ine)
        }
    }
}