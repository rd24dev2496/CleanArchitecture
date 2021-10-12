package com.example.cleanarchmealapp.domain.repository

import com.example.cleanarchmealapp.data.model.MealsDTO

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO

}