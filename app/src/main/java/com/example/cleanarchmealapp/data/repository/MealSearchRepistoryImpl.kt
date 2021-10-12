package com.example.cleanarchmealapp.data.repository

import com.example.cleanarchmealapp.data.model.MealsDTO
import com.example.cleanarchmealapp.data.remote.MealSearchAPI
import com.example.cleanarchmealapp.domain.repository.MealSearchRepository


class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}