package com.aok.a03_calismayapisi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aok.a03_calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val msgKarsilama = intent.getStringExtra("mesaj")

        binding.textView.setText(msgKarsilama)

    }
}