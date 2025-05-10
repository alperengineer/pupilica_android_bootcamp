package com.aok.odev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aok.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentInput = ""
    private var toplam = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberButtons = listOf(
            binding.btn0, binding.btn1, binding.btn2, binding.btn3, binding.btn4,
            binding.btn5, binding.btn6, binding.btn7, binding.btn8, binding.btn9
        )

        numberButtons.forEach { button ->
            button.setOnClickListener {
                val digit = button.text.toString()
                currentInput += digit
                binding.textResult.text = currentInput
            }
        }

        binding.btnAdd.setOnClickListener {
            val number = currentInput.toIntOrNull()
            if (number != null) {
                toplam += number
                binding.textResult.text = toplam.toString()
                currentInput = ""
            }
        }

        binding.btnClear.setOnClickListener {
            currentInput = ""
            toplam = 0
            binding.textResult.text = "0"
        }
    }
}
