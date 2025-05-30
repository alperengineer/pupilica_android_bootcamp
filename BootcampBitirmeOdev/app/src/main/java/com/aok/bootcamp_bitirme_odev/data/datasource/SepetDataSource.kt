package com.aok.bootcamp_bitirme_odev.data.datasource

import com.aok.bootcamp_bitirme_odev.data.model.Cart
import com.aok.bootcamp_bitirme_odev.retrofit.dao.SepetDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SepetDataSource(val cartDao: SepetDao) {

    val kullanici_adi = "aokucukcal"

    suspend fun loadCart(): List<Cart> = withContext(Dispatchers.IO) {
        try {
            val response = cartDao.loadCart(kullanici_adi)
            response.cart
        } catch (e: Exception) {
            emptyList()
        }
        return@withContext cartDao.loadCart(kullanici_adi).cart
    }

    suspend fun addCart(
        yemek_adi: String,
        yemek_resim_adi: String,
        yemek_fiyat: Int,
        yemek_siparis_adet: Int
    ) {
        cartDao.addCart(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi)
    }
}