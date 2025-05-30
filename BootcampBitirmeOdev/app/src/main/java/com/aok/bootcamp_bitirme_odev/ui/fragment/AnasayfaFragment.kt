package com.aok.bootcamp_bitirme_odev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.aok.bootcamp_bitirme_odev.R
import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.aok.bootcamp_bitirme_odev.databinding.FragmentAnasayfaBinding
import com.aok.bootcamp_bitirme_odev.ui.adapter.FoodAdapter
import com.aok.bootcamp_bitirme_odev.ui.fragment.AnasayfaFragmentDirections
import com.aok.bootcamp_bitirme_odev.ui.viewmodel.AnasayfaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    private val cartItems: MutableList<Food> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        viewModel.foodList.observe(viewLifecycleOwner) {
            val foodAdapter = FoodAdapter(requireContext(), it, viewModel)
            binding.rvFood.adapter = foodAdapter
        }

        binding.rvFood.layoutManager = LinearLayoutManager(requireContext())

        binding.fabCart.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSepetFragment)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }




}