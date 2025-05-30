package com.aok.bootcamp_bitirme_odev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.aok.bootcamp_bitirme_odev.databinding.FragmentSepetBinding
import com.aok.bootcamp_bitirme_odev.ui.adapter.CartAdapter
import com.aok.bootcamp_bitirme_odev.ui.viewmodel.SepetViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SepetFragment : Fragment() {

    private lateinit var binding: FragmentSepetBinding
    private lateinit var viewModel: SepetViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSepetBinding.inflate(inflater, container, false)

        viewModel.cartList.observe(viewLifecycleOwner) {
            val cartAdapter = CartAdapter(requireContext(), it, viewModel)
            binding.rvCart.adapter = cartAdapter
        }

        binding.rvCart.layoutManager = LinearLayoutManager(requireContext())


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : SepetViewModel by viewModels()
        viewModel = tempViewModel
    }

}