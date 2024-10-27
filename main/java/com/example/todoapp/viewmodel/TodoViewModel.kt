package com.example.todoapp.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.model.Todo
import com.example.todoapp.model.TodosApi
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    val todos = mutableStateListOf<Todo>()

    init {
        getTodosList()
    }

    private fun getTodosList() {
        viewModelScope.launch {
            try {
                val todosFromApi = TodosApi.getInstance().getTodos()
                todos.clear()
                todos.addAll(todosFromApi)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
