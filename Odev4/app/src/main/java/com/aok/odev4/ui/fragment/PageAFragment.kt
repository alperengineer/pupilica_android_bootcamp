package com.aok.odev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aok.odev4.R
import com.aok.odev4.databinding.FragmentMainBinding
import com.aok.odev4.databinding.FragmentPageABinding

class PageAFragment : Fragment() {

    private lateinit var binding: FragmentPageABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.btnGoB.setOnClickListener {
            findNavController().navigate(R.id.pageBGecis)
            Toast.makeText(requireContext(), "B'ye git butonuna basıldı", Toast.LENGTH_SHORT).show()
        }


        return binding.root
    }

}