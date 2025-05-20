package com.aok.odev7.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aok.odev7.R
import com.aok.odev7.databinding.FragmentEkleBinding

class EkleFragment : Fragment() {

    private lateinit var binding: FragmentEkleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentEkleBinding.inflate(inflater, container, false)


        return binding.root
    }
}