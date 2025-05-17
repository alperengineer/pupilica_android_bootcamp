package com.aok.odev6.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aok.odev6.R
import com.aok.odev6.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Teslimat adresi seçimi BottomSheetDialog
        binding.cardAddressChoice.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toAddressBottomSheetDialog)
        }


        return binding.root
    }

}