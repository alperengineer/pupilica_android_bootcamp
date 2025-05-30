package com.aok.bootcamp_bitirme_odev.retrofit.dao

import com.aok.bootcamp_bitirme_odev.data.model.response.FoodResponse
import retrofit2.http.GET

interface FoodDao {
    @GET("tumYemekleriGetir.php")
    suspend fun loadFood(): FoodResponse
}