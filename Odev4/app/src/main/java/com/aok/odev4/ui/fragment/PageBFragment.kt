package com.aok.odev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aok.odev4.R
import com.aok.odev4.databinding.FragmentPageBBinding

class PageBFragment : Fragment() {

    private lateinit var binding : FragmentPageBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.pageYGecisB)
            Toast.makeText(requireContext(), "Y'ye Git butonuna basıldı B'de", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}