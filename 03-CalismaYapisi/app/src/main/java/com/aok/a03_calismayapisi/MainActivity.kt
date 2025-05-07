package com.aok.a03_calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aok.a03_calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetay.setOnClickListener {
            val intent = Intent(this@MainActivity, DetayActivity::class.java)
            intent.putExtra("mesaj", "Selam, nasılsın?")
            startActivity(intent)
            // Veri transferi sayfa geçişi ile olur
        }

    }
}