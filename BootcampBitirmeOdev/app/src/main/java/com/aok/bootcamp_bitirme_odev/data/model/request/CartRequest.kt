package com.aok.bootcamp_bitirme_odev.data.model.request

import java.io.Serializable

class CartRequest(
    var sepet_yemek_id: Int,
    var yemek_adi: String,
    var yemek_resim_adi: String,
    var yemek_fiyat: Int,
    var yemek_siparis_adet: Int,
    var kullanici_adi: String
) : Serializable {
}