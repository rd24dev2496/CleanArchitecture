package com.example.cleanarchmealapp.domain.repository

import com.example.cleanarchmealapp.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String): MealsDTO

}