package com.aok.bootcamp_bitirme_odev.data.repository

import com.aok.bootcamp_bitirme_odev.data.datasource.SepetDataSource
import com.aok.bootcamp_bitirme_odev.data.model.Cart

class SepetRepository(var cartDataSource: SepetDataSource) {
    suspend fun loadCart(): List<Cart> = cartDataSource.loadCart()

    suspend fun addCart(
        yemek_adi: String,
        yemek_resim_adi: String,
        yemek_fiyat: Int,
        yemek_siparis_adet: Int
    ) {
        cartDataSource.addCart(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet)

    }

}