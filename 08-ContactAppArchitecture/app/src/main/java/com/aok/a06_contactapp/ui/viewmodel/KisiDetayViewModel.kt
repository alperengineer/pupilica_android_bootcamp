package com.aok.a06_contactapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.aok.a06_contactapp.data.repository.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiDetayViewModel @Inject constructor(var kisilerRepository : KisilerRepository) : ViewModel() {
    // var kisilerRepository = KisilerRepository() // erişim nesnesi oluşturduk

    fun guncelle(kisi_id: Int, kisi_ad: String,kisi_tel: String){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.guncelle(kisi_id, kisi_ad, kisi_tel)
        }
    }
}