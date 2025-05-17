package com.aok.a06_contactapp.data.datasource

import android.util.Log
import com.aok.a06_contactapp.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource {

    suspend fun kaydet(kisi_ad: String, kisi_tel: String) {
        Log.e("Kişi Kaydet", "$kisi_ad - $kisi_tel")
    }

    suspend fun guncelle(kisi_id: Int, kisi_ad: String,kisi_tel: String){
        Log.e("Kisi Guncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun ara(aramaKelimesi:String) : List<Kisiler> = withContext(Dispatchers.IO) {
        val kisilerListesi = ArrayList<Kisiler>()

        val k1 = Kisiler(1, "Ahmet", "05070000001")
        val k2 = Kisiler(2, "Mehmet", "05070000002")
        val k3 = Kisiler(3, "Ayşe", "05070000003")
        val k4 = Kisiler(4, "Fatma", "05070000004")
        val k5 = Kisiler(5, "Ali", "05070000005")
        val k6 = Kisiler(6, "Zeynep", "05070000006")
        val k7 = Kisiler(7, "Mert", "05070000007")
        val k8 = Kisiler(8, "Elif", "05070000008")
        val k9 = Kisiler(9, "Burak", "05070000009")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerListesi.add(k4)
        kisilerListesi.add(k5)
        kisilerListesi.add(k6)
        kisilerListesi.add(k7)
        kisilerListesi.add(k8)
        kisilerListesi.add(k9)


        return@withContext  kisilerListesi
    }

    suspend fun sil(kisi_id : Int){
        Log.e("Kişi Sil", kisi_id.toString())
    }

    suspend fun kisileriYukle() : List<Kisiler> = withContext(Dispatchers.IO) {
        val kisilerListesi = ArrayList<Kisiler>()

        val k1 = Kisiler(1, "Ahmet", "05070000001")
        val k2 = Kisiler(2, "Mehmet", "05070000002")
        val k3 = Kisiler(3, "Ayşe", "05070000003")
        val k4 = Kisiler(4, "Fatma", "05070000004")
        val k5 = Kisiler(5, "Ali", "05070000005")
        val k6 = Kisiler(6, "Zeynep", "05070000006")
        val k7 = Kisiler(7, "Mert", "05070000007")
        val k8 = Kisiler(8, "Elif", "05070000008")
        val k9 = Kisiler(9, "Burak", "05070000009")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerListesi.add(k4)
        kisilerListesi.add(k5)
        kisilerListesi.add(k6)
        kisilerListesi.add(k7)
        kisilerListesi.add(k8)
        kisilerListesi.add(k9)


        return@withContext  kisilerListesi
    }

}