package com.NPCI.service;

import java.util.List;

import com.NPCI.entity.Todo;


public interface TodoServiceContract {
    List<Todo> getAllUsers();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Todo todo);
    Todo deleteTodo(Long id);
}

