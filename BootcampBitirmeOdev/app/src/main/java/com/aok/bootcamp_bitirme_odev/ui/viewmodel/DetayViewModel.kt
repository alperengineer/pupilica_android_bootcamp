package com.aok.bootcamp_bitirme_odev.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aok.bootcamp_bitirme_odev.data.repository.SepetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetayViewModel @Inject constructor(var sepetRepository: SepetRepository): ViewModel(){

    fun addToCart(
        yemekAdi: String,
        yemekResimAdi: String,
        yemekFiyat: Int,
        yemekSiparisAdet: Int
    ) {
        viewModelScope.launch {
            sepetRepository.addCart(yemekAdi, yemekResimAdi, yemekFiyat, yemekSiparisAdet)
        }
    }

}