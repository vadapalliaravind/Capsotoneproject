package org.npci.java_project.services;
import java.util.List;
import org.npci.java_project.entities.Todo;

public interface TodoServiceContract {

	List<Todo> getAllUsers();
	Todo getTodoById();
	Todo createTodo(Todo todo);
	Todo updateTodo(Todo todo);
	Todo deleteTodo(Todo todo);
}



