package com.aok.a06_contactapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aok.a06_contactapp.R
import com.aok.a06_contactapp.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.btnKisiKayit.setOnClickListener {
            val kisiAd = binding.editTextKisiAd.text.toString()
            val kisiTel = binding.editTextKisiTel.text.toString()
            kaydet(kisiAd,kisiTel)

        }

        return binding.root
    }

    fun kaydet(kisiAd:String, kisiTel: String){
        Log.e("KAYDET", "Kişi Ad: $kisiAd \nKişi Tel: $kisiTel")
    }
}