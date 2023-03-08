package com.wazzii_tech.data.repo

import com.wazzii_tech.data.remote.ApiService
import com.wazzii_tech.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService):MealsRepo {
    override fun getMealsFromRemote() = apiService.getMeals()

}