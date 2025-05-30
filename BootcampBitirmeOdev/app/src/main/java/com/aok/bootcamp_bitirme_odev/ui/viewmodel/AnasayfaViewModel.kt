package com.aok.bootcamp_bitirme_odev.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.aok.bootcamp_bitirme_odev.data.repository.FoodRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var foodRepository: FoodRepository): ViewModel(){
    var foodList = MutableLiveData<List<Food>>()

    init {
        loadFood()
    }

    fun loadFood(){
        CoroutineScope(Dispatchers.Main).launch {
            try{
                foodList.value = foodRepository.loadFood()
            } catch (e: Exception){
                Log.e("loadFood()", e.message.toString())
            }
        }
    }
}