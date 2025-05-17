package com.aok.odev6.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aok.odev6.databinding.FragmentCampaignBinding

class CampaignFragment : Fragment() {

    private lateinit var binding: FragmentCampaignBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCampaignBinding.inflate(inflater, container, false)



        return binding.root
    }

}