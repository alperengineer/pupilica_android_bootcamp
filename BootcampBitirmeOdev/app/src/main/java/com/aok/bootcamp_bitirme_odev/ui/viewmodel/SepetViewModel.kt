package com.aok.bootcamp_bitirme_odev.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aok.bootcamp_bitirme_odev.data.model.Cart
import com.aok.bootcamp_bitirme_odev.data.repository.SepetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SepetViewModel @Inject constructor(var sepetRepository: SepetRepository) : ViewModel() {
    var cartList = MutableLiveData<List<Cart>>()

    init {
        loadCart()
    }

    fun loadCart() {
        viewModelScope.launch {
            try {
                val cart = sepetRepository.loadCart()
                Log.e("SepetVieModel loadCart()", "YemekRepo-> $cart")
                cartList.postValue(cart)
            } catch (e: Exception) {
                Log.e("SepetVieModel loadCart()", "Sepete Yemekler Getirilemedi")
                cartList.postValue(emptyList())
            }
        }
    }

}