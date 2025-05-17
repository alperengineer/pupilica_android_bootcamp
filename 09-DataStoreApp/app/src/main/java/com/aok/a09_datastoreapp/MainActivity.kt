package com.aok.a09_datastoreapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aok.a09_datastoreapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appPref = AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {
            appPref.sil()

            var gelenSayac = appPref.oku()
            appPref.kayit(++gelenSayac)

            binding.tvSayaci.text = "Açılış Sayısı: $gelenSayac"
        }
    }
}