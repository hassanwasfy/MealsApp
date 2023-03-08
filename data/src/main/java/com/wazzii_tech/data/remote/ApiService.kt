package com.wazzii_tech.data.remote

import com.wazzii_tech.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    fun getMeals(): CategoryResponse

}


