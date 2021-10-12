package com.example.cleanarchmealapp.data.repository

import com.example.cleanarchmealapp.data.model.MealsDTO
import com.example.cleanarchmealapp.data.remote.MealSearchAPI
import com.example.cleanarchmealapp.domain.repository.MealDetailsRepository


class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}