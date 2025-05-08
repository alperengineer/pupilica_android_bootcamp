package com.aok.odev4.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aok.odev4.R
import com.aok.odev4.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btnGoA.setOnClickListener() {
            findNavController().navigate(R.id.pageAGecis)
            Toast.makeText(requireContext(),"A'ya Git butonuna basıldı", Toast.LENGTH_SHORT).show()
        }

        binding.btnGoX.setOnClickListener {
            Toast.makeText(requireContext(),"X'e Git butonuna basıldı", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.pageXGecis)
        }

        return binding.root
    }

}