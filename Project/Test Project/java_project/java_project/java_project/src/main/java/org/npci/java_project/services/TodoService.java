package org.npci.java_project.services;

import java.util.List;

import org.npci.java_project.entities.Todo;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.letsupgrade.entities.User;
import org.letsupgrade.repository.UserSpringDataJPARepository;
import org.letsupgrade.services.UserServiceContract;
import org.npci.java_project.Repository.TodoSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoServiceContract {

	@Autowired
	private TodoSpringDataJPARepository repository;
	

	@Override
	public List<Todo> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo getTodoById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo createTodo(Todo todo) {
		System.out.println(todo.getCreatedAt());
		todo.setCreatedAt(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
		System.out.println(todo.getCreatedAt());
		return repository.save(todo);
	}
	

	@Override
	public Todo updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo deleteTodo(Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}
}
