package com.aok.bootcamp_bitirme_odev.di

import com.aok.bootcamp_bitirme_odev.data.datasource.FoodDataSource
import com.aok.bootcamp_bitirme_odev.data.datasource.SepetDataSource
import com.aok.bootcamp_bitirme_odev.data.repository.FoodRepository
import com.aok.bootcamp_bitirme_odev.data.repository.SepetRepository
import com.aok.bootcamp_bitirme_odev.retrofit.ApiUtils
import com.aok.bootcamp_bitirme_odev.retrofit.dao.FoodDao
import com.aok.bootcamp_bitirme_odev.retrofit.dao.SepetDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideFoodRepository(foodDataSource: FoodDataSource): FoodRepository{
        return FoodRepository(foodDataSource)
    }

    @Provides
    @Singleton
    fun provideFoodDataSource(foodDao: FoodDao) : FoodDataSource {
        return FoodDataSource(foodDao)
    }

    @Provides
    @Singleton
    fun provideFoodDao(): FoodDao{
        return ApiUtils.getYemeklerDao()
    }

    @Provides
    @Singleton
    fun provideCartRepository(cartDataSource: SepetDataSource): SepetRepository{
        return SepetRepository(cartDataSource)
    }

    @Provides
    @Singleton
    fun provideCartDataSource(sepetDao: SepetDao) : SepetDataSource {
        return SepetDataSource(sepetDao)
    }

    @Provides
    @Singleton
    fun provideSepetDao(): SepetDao{
        return ApiUtils.getSepetlerDao()
    }
}