package com.example.cleanarchmealapp.presentation.meal_details

import com.example.cleanarchmealapp.domain.model.MealDetails


data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}