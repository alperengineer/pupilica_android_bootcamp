package com.aok.a04_navigationcomponentkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.aok.a04_navigationcomponentkullanimi.databinding.FragmentAyarlarBinding

class AyarlarFragment : Fragment() {

    private lateinit var binding: FragmentAyarlarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAyarlarBinding.inflate(inflater, container, false)

        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)
        }



        return binding.root

    }

}