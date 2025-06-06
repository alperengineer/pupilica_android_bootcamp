package com.aok.a06_contactapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aok.a06_contactapp.R
import com.aok.a06_contactapp.databinding.FragmentKisiKayitBinding
import com.aok.a06_contactapp.ui.viewmodel.KisiKayitViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    private lateinit var viewModel: KisiKayitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.btnKisiKayit.setOnClickListener {
            val kisiAd = binding.editTextKisiAd.text.toString()
            val kisiTel = binding.editTextKisiTel.text.toString()
            viewModel.kaydet(kisiAd,kisiTel)

        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : KisiKayitViewModel by viewModels()
        viewModel = tempViewModel
    }


}