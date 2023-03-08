package com.wazzii_tech.domain.repo

import com.wazzii_tech.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryResponse
}