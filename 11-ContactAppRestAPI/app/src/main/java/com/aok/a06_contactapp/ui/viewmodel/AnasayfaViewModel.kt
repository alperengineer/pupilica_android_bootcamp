package com.aok.a06_contactapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aok.a06_contactapp.data.entity.Kisiler
import com.aok.a06_contactapp.data.repository.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var kisilerRepository : KisilerRepository) : ViewModel() {
    //  var kisilerRepository = KisilerRepository() // erişim nesnesi oluşturduk
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
    }


    fun ara(arananKisi: String){
        CoroutineScope(Dispatchers.Main).launch {
           try {
               kisilerListesi.value = kisilerRepository.ara(arananKisi)
           } catch (e: Exception) {

           }

        }
    }

    fun sil(kisi_id : Int){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.sil(kisi_id)
            kisileriYukle()
        }
    }

    fun kisileriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                kisilerListesi.value = kisilerRepository.kisileriYukle() // tetikleme
            }catch (e: Exception){

            }
        }
    }

}