package com.aok.bootcamp_bitirme_odev.retrofit

import com.aok.bootcamp_bitirme_odev.retrofit.dao.FoodDao
import com.aok.bootcamp_bitirme_odev.retrofit.dao.SepetDao

class ApiUtils {

    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/yemekler/"

        fun getYemeklerDao(): FoodDao {
            return RetrofitClient.getClient(BASE_URL).create(FoodDao::class.java)
        }

        fun getSepetlerDao(): SepetDao {
            return RetrofitClient.getClient(BASE_URL).create(SepetDao::class.java)
        }
    }

}