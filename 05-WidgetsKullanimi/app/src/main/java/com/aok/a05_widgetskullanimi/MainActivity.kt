package com.aok.a05_widgetskullanimi

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aok.a05_widgetskullanimi.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var kontrol = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ulkeler = ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("Arjantin")
        ulkeler.add("İtalya")

        val arrayAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1,ulkeler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            kontrol = isChecked
            if(isChecked){
                val secilenBtn = findViewById<Button>(checkedId)
                val buttonYazi = secilenBtn.text.toString()

                Log.e("sonuc", "Button Yazı: $buttonYazi")
            }
        }

        binding.button2.setOnClickListener {
            if(kontrol){
                val secilenBtn = findViewById<Button>(binding.toggleButton.checkedButtonId  /*binding.toggleButton.checkedButtonId = checkedId*/)
                val buttonYazi = secilenBtn.text.toString()

                Log.e("sonuc", "Button Yazı: $buttonYazi")
            }

            val secilenUlke = binding.autoCompleteTextView.text.toString()
            Log.e("sonuc", "Seçilen Ülke: $secilenUlke")
        }

        binding.buttonAlert.setOnClickListener {
            MaterialAlertDialogBuilder(this@MainActivity)
                .setTitle("Başlık")
                .setMessage("Bu bir Alert Dialog'tur")
                .setPositiveButton("Tamam") {d,i ->
                    Toast.makeText(this@MainActivity, "Tamam butonuna tıklandı", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton ("İptal"){ d,i->
                    Toast.makeText(this@MainActivity, "İptal butonuna tıklandı", Toast.LENGTH_SHORT).show()
                }
                .show()

        }



    }


}