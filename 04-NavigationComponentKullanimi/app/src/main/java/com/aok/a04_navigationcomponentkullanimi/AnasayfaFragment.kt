package com.aok.a04_navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.aok.a04_navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            // veri gönderilecek olan sınıfın başına Directions eki gelir
            val gecis = AnasayfaFragmentDirections.detayGecis(mesaj = "Merhaba, nasılsın?", sayi = 33)

            Navigation.findNavController(it).navigate(gecis)
        }


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Uygulamayı çalıştırdığımız anda bir kere çalışır setup() fonksiyonu gibi

        Log.e("YasamDongusu", "onCreate")
        Log.d("YasamDongusu", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        // Bulunduğu sayfa her görüldüğünde çalışır
        // Bu sayfaya geri dönüldüğünde çalışır
        Log.e("YasamDongusu", "onResume")
        Log.d("YasamDongusu", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Sayfa her görünmez olduğunda çalışır
        Log.e("YasamDongusu", "onPause")
        Log.d("YasamDongusu", "onPause")
    }


}