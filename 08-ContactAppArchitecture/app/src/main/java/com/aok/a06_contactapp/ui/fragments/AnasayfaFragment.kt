package com.aok.a06_contactapp.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.aok.a06_contactapp.R
import com.aok.a06_contactapp.data.entity.Kisiler
import com.aok.a06_contactapp.databinding.FragmentAnasayfaBinding
import com.aok.a06_contactapp.ui.adapter.KisilerAdapter
import com.aok.a06_contactapp.ui.viewmodel.AnasayfaViewModel
import com.aok.a06_contactapp.utils.gecisYap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)

        binding.fab.setOnClickListener {
            // Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
            Navigation.gecisYap(it, R.id.kisiKayitGecis)
        }

        viewModel.kisilerListesi.observe(viewLifecycleOwner) { // gözlemci,dinleme

            val kisilerAdapter = KisilerAdapter(requireContext(), it, viewModel)
            binding.kisilerRV.adapter = kisilerAdapter

        }

        binding.kisilerRV.layoutManager = LinearLayoutManager(requireContext())


        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean { // Harf girildilçe ve silindikçe
                viewModel.ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean { // Arama butonuna basıldıkça
                viewModel.ara(query)
                return true
            }
        })

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.kisileriYukle()
    }



}