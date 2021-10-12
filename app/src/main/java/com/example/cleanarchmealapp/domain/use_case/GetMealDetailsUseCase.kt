package com.example.cleanarchmealapp.domain.use_case

import com.bumptech.glide.load.engine.Resource
import com.example.cleanarchmealapp.data.model.toDomainMealDetails
import com.example.cleanarchmealapp.domain.model.MealDetails
import com.example.cleanarchmealapp.domain.repository.MealDetailsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException

import org.openjdk.tools.javac.resources.CompilerProperties.Errors.Error
import retrofit2.HttpException
import javax.inject.Inject


class GetMealDetailsUseCase @Inject constructor(private val repository: MealDetailsRepository) {

    operator fun invoke(id:String): Flow<Resource<List<MealDetails>>> = flow {
        try {
          //  emit(Resource.Loading())
            val data = repository.getMealDetails(id)
            val domainData =
                if (!data.meals.isNullOrEmpty()) data.meals.map { it -> it.toDomainMealDetails() } else emptyList()
            //emit(Resource.Success(data = domainData))
        } catch (e: HttpException) {
          //  emit(Resource.Error(message = e.localizedMessage ?: "An Unknown error occurred"))
        } catch (e: IOException) {
         //   emit(Resource.Error(message = e.localizedMessage ?: "Check Connectivity"))
        } catch (e: Exception) {

        }
    }


}