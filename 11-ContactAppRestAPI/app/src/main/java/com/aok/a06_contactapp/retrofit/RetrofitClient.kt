package com.aok.a06_contactapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object { // static

        fun getClient(baseUrl: String) : Retrofit {
               return Retrofit.Builder()
                   .baseUrl(baseUrl)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build()
        }

    }

}