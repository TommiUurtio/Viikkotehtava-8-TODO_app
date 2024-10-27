package com.example.todoapp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface TodosApi {
    @GET("todos")
    suspend fun getTodos(): List<Todo>

    companion object {
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        fun getInstance(): TodosApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TodosApi::class.java)
        }
    }
}
