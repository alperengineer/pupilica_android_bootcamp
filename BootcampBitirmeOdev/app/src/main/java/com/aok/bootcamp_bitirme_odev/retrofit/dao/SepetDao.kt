package com.aok.bootcamp_bitirme_odev.retrofit.dao

import com.aok.bootcamp_bitirme_odev.data.model.CRUDResponse
import com.aok.bootcamp_bitirme_odev.data.model.response.CartResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SepetDao {

    @POST("sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    suspend fun loadCart(@Field("kullanici_adi") kullanici_adi: String): CartResponse

    @POST("sepeteYemekEkle.php")
    @FormUrlEncoded
    suspend fun addCart(
        @Field("yemek_adi") yemek_adi: String,
        @Field("yemek_resim_adi") yemek_resim_adi: String,
        @Field("yemek_fiyat") yemek_fiyat: Int,
        @Field("yemek_siparis_adet") yemek_siparis_adet: Int,
        @Field("kullanici_adi") kullanici_adi: String
    ): CRUDResponse
}