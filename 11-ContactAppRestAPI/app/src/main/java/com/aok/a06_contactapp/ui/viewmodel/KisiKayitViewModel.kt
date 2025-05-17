package com.aok.a06_contactapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.aok.a06_contactapp.data.repository.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel @Inject constructor(var kisilerRepository : KisilerRepository): ViewModel() {
    // var kisilerRepository = KisilerRepository() // erişim nesnesi oluşturduk

    fun kaydet(kisi_ad: String, kisi_tel: String) { // Main -> Arayüz | IO -> Thread, Veri Tabanı İşlemleri
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.kaydet(kisi_ad, kisi_tel)
        }

    }
}