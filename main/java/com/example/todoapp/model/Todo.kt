package com.example.todoapp.model

import com.google.gson.annotations.SerializedName

data class Todo(
    val userId: Int,
    val id: Int,
    val title: String,
    @SerializedName("completed") val isCompleted: Boolean
)
