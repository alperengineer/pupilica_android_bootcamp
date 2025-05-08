package com.aok.odev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aok.odev4.R
import com.aok.odev4.databinding.FragmentPageXBinding

class PageXFragment : Fragment() {

    private lateinit var binding : FragmentPageXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageXBinding.inflate(inflater, container, false)

        binding.btnGoY.setOnClickListener {
            findNavController().navigate(R.id.pageYGecisX)
            Toast.makeText(requireContext(), "Y'ye Git butonuna basıldı X'te", Toast.LENGTH_SHORT).show()
        }



        return binding.root
    }

}