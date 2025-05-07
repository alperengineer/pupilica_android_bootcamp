package com.aok.a06_contactapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aok.a06_contactapp.R
import com.aok.a06_contactapp.data.entity.Kisiler
import com.aok.a06_contactapp.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        binding.btnDetay.setOnClickListener {
            val kisi1 = Kisiler(1,"Alperen Oğuz Kucukcal", "05078712402")

            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi1)
            Navigation.findNavController(it).navigate(gecis)
        }



        return binding.root
    }


}