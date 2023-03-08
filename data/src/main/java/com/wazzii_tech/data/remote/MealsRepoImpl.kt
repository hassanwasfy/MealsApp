package com.wazzii_tech.data.remote

import com.wazzii_tech.domain.entity.CategoryResponse
import com.wazzii_tech.domain.repo.MealsRepo


class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}