package com.aok.a06_contactapp.data.repository

import android.util.Log
import com.aok.a06_contactapp.data.datasource.KisilerDataSource
import com.aok.a06_contactapp.data.entity.Kisiler

class KisilerRepository(var kisilerDataSource : KisilerDataSource){
    // Repository amacı veri kaynağının erişimini sağlamaktır. İletir yalnızca
    // var kisilerDataSource = KisilerDataSource() // erişim nesnesi oluşturduk

    suspend fun kaydet(kisi_ad: String, kisi_tel: String) = kisilerDataSource.kaydet(kisi_ad, kisi_tel)
    suspend fun guncelle(kisi_id: Int, kisi_ad: String,kisi_tel: String) = kisilerDataSource.guncelle(kisi_id,kisi_ad,kisi_tel)
    suspend fun ara(arananKisi: String) : List<Kisiler> = kisilerDataSource.ara(arananKisi)
    suspend fun sil(kisi_id : Int) = kisilerDataSource.sil(kisi_id)
    suspend fun kisileriYukle() : List<Kisiler> = kisilerDataSource.kisileriYukle()

}