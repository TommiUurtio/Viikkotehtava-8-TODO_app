package com.example.todoapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.viewmodel.TodoViewModel
import com.example.todoapp.model.Todo

@Composable
fun TodoScreen(todoViewModel: TodoViewModel = viewModel()) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        TodoList(todos = todoViewModel.todos)
    }
}

@Composable
fun TodoList(todos: List<Todo>) {
    LazyColumn {
        items(todos) { todo ->
            Text(text = todo.title)
        }
    }
}
