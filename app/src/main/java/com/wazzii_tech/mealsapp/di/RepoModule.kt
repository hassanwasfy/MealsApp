package com.wazzii_tech.mealsapp.di

import com.wazzii_tech.data.remote.ApiService
import com.wazzii_tech.data.repo.MealsRepoImpl
import com.wazzii_tech.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providesRepo(apiService: ApiService):MealsRepo{
        return MealsRepoImpl(apiService)
    }



}