package com.aok.bootcamp_bitirme_odev.data.datasource

import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.aok.bootcamp_bitirme_odev.retrofit.dao.FoodDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodDataSource(val foodDao: FoodDao) {
    suspend fun loadFood(): List<Food> = withContext(Dispatchers.IO) {
        return@withContext foodDao.loadFood().food
    }
}