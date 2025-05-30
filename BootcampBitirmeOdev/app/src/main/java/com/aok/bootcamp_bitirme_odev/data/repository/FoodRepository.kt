package com.aok.bootcamp_bitirme_odev.data.repository

import com.aok.bootcamp_bitirme_odev.data.datasource.FoodDataSource
import com.aok.bootcamp_bitirme_odev.data.model.Food

class FoodRepository(var foodDataSource: FoodDataSource) {
    suspend fun loadFood(): List<Food> = foodDataSource.loadFood()
}