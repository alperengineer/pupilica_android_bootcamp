package com.aok.a04_navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.aok.a04_navigationcomponentkullanimi.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)
        // Veri okurken sınıfın sonuna ARGS eki gelir
        val bundle: DetayFragmentArgs by navArgs()
        val gelenMesaj = bundle.mesaj
        val gelenSayi = bundle.sayi

        binding.textView3.setText("Gelen Mesaj: $gelenMesaj \nGelen Sayi: $gelenSayi")
        
        val geriTusu = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.e("Detay Sayfa", "Geri dönüş tuşu çalıştı")
                isEnabled = false
            }
            
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)

        return binding.root
    }

}