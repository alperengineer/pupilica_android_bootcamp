package com.aok.a06_contactapp.retrofit

class ApiUtils {

    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"
        // BASE_URL = http://kasimadalan.pe.hu/
        // API_URL = kisiler/tum_kisiler.php


        fun getKisilerDao(): KisilerDao {
            return RetrofitClient
                .getClient(BASE_URL)
                .create(KisilerDao::class.java)
        }


    }

}