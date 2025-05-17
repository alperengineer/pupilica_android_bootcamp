package com.aok.a06_contactapp.di

import com.aok.a06_contactapp.data.datasource.KisilerDataSource
import com.aok.a06_contactapp.data.repository.KisilerRepository
import com.aok.a06_contactapp.retrofit.ApiUtils
import com.aok.a06_contactapp.retrofit.KisilerDao
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
    fun provideKisilerRepository(kisilerDataSource: KisilerDataSource) : KisilerRepository {
        return KisilerRepository(kisilerDataSource)
    }

    @Provides
    @Singleton
    fun provideKisilerDataSource(kisilerDao: KisilerDao) : KisilerDataSource {
        return KisilerDataSource(kisilerDao)
    }

    @Provides
    @Singleton
    fun provideKisilerDao() : KisilerDao {
        return ApiUtils.getKisilerDao()
    }

}