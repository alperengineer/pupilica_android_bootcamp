package com.aok.a06_contactapp.data.datasource

import android.util.Log
import com.aok.a06_contactapp.data.entity.CRUDCevap
import com.aok.a06_contactapp.data.entity.Kisiler
import com.aok.a06_contactapp.retrofit.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kisilerDao: KisilerDao) {

    suspend fun kaydet(kisi_ad: String, kisi_tel: String) {
        val crudCevap = kisilerDao.kaydet(kisi_ad, kisi_tel)
        Log.e("Kişi Kaydet", crudCevap.success.toString())
    }

    suspend fun guncelle(kisi_id: Int, kisi_ad: String,kisi_tel: String){
        val crudCevap = kisilerDao.guncelle(kisi_id,kisi_ad,kisi_tel)
        Log.e("Kişi Güncelle", crudCevap.success.toString())
        Log.e("Kişi Güncelle", crudCevap.message)
    }

    suspend fun ara(aramaKelimesi:String) : List<Kisiler> = withContext(Dispatchers.IO) {
        return@withContext kisilerDao.ara(aramaKelimesi).kisiler
    }

    suspend fun sil(kisi_id : Int){
        val crudCevap : CRUDCevap = kisilerDao.sil(kisi_id)
        Log.e("Kişi Sil", crudCevap.success.toString())
        Log.e("Kişi Sil", crudCevap.message)
    }

    suspend fun kisileriYukle() : List<Kisiler> = withContext(Dispatchers.IO) {
        return@withContext kisilerDao.kisileriYukle().kisiler
    }

}