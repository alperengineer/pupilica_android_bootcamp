package com.aok.bootcamp_bitirme_odev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieConfig
import com.aok.bootcamp_bitirme_odev.databinding.FragmentDetayBinding
import com.aok.bootcamp_bitirme_odev.ui.adapter.CartAdapter
import com.aok.bootcamp_bitirme_odev.ui.viewmodel.DetayViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    private lateinit var viewModel: DetayViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs()
        val gelenFood = bundle.food

        binding.tvDetayFoodName.setText(gelenFood.yemek_adi)
        binding.tvDetayFoodPrice.setText("${gelenFood.yemek_fiyat}₺")

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/${gelenFood.yemek_resim_adi}"
        Glide.with(requireContext()).load(url).override(350,350).into(binding.ivDetayImg)

        var quantity = 1
        binding.tvQuantity.text = quantity.toString()
        binding.btnDecrease.isEnabled = false

        binding.btnIncrease.setOnClickListener {
            quantity++
            binding.tvQuantity.text = quantity.toString()

            if (quantity > 1) {
                binding.btnDecrease.isEnabled = true
            }
        }

        binding.btnDecrease.setOnClickListener {
            if (quantity > 1) {
                quantity--
                binding.tvQuantity.text = quantity.toString()

                if (quantity == 1) {
                    binding.btnDecrease.isEnabled = false
                }
            }
        }

        binding.btnAddToCart.setOnClickListener {

            val yemekAdi = gelenFood.yemek_adi
            val yemekResimAdi = gelenFood.yemek_resim_adi
            val yemekFiyat = gelenFood.yemek_fiyat.toInt()
            val siparisAdet = quantity

            viewModel.addToCart(
                yemekAdi,
                yemekResimAdi,
                yemekFiyat,
                siparisAdet
            )

            Toast.makeText(requireContext(), "$siparisAdet adet $yemekAdi sepete eklendi.", Toast.LENGTH_SHORT).show()

        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : DetayViewModel by viewModels()
        viewModel = tempViewModel
    }

}