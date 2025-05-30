package com.aok.bootcamp_bitirme_odev.data.model.response

import com.aok.bootcamp_bitirme_odev.data.model.Cart
import com.google.gson.annotations.SerializedName

class CartResponse (
    @SerializedName("sepet_yemekler")
    val cart: List<Cart>,

    @SerializedName("success")
    val success: Int
){}