package com.aok.bootcamp_bitirme_odev.data.model

import java.io.Serializable

data class Food(
    var yemek_id: String,
    var yemek_adi: String,
    var yemek_resim_adi: String,
    var yemek_fiyat: String
) : Serializable {}