package com.wazzii_tech.mealsapp.di

import com.wazzii_tech.domain.repo.MealsRepo
import com.wazzii_tech.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GetMeals{
        return GetMeals(mealsRepo)
    }

}