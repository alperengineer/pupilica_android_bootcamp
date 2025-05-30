package com.aok.bootcamp_bitirme_odev.data.model.response

import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.google.gson.annotations.SerializedName

data class FoodResponse(
    @SerializedName("yemekler")
    val food: List<Food>,

    @SerializedName("success")
    val success: Int
) {}