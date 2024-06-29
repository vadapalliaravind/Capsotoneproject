package com.NPCI.service;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//import org.letsupgrade.entities.User;
//import org.letsupgrade.repository.UserSpringDataJPARepository;
//import org.letsupgrade.services.UserServiceContract;
//import org.npci.java_project.Repository.TodoSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.NPCI.entity.Todo;
import com.NPCI.repo.TodoSpringDataJPARepository;

//import com.NPCI_Project1.java_project.entities.Todo;
//import com.NPCI_Project1.java_project.repository.TodoSpringDataJPARepository;

@Service
public class TodoService implements TodoServiceContract {

	@Autowired
    private TodoSpringDataJPARepository repository;
	

	@Override
    public List<Todo> getAllUsers() {
        return repository.findAll();
    }

	@Override
    public Todo getTodoById(Long id) {
        Optional<Todo> todo = repository.findById(id);
        return todo.orElse(null);
    }
    
		
	
	@Override
    public Todo createTodo(Todo todo) {
        todo.setCreatedAt(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        return repository.save(todo);
    }
	
	@Override
    public Todo deleteTodo(Long id) {
        Optional<Todo> todo = repository.findById(id);
        if (todo.isPresent()) {
            repository.delete(todo.get());
            return todo.get();
        } else {
            return null; 
        }
    }

	@Override
	public Todo updateTodo(Todo todo) {
	    Optional<Todo> existingTodoOptional = repository.findById(todo.getId());
	    if (existingTodoOptional.isPresent()) {
	        Todo existingTodo = existingTodoOptional.get();
	        existingTodo.setTitle(todo.getTitle());
	        existingTodo.setDescription(todo.getDescription());
	        return repository.save(existingTodo);
	    } else {
	            return null;
	    }
	}

	public Todo updateStatusTodo(long id) {
		// TODO Auto-generated method stub
		
		Todo todo = repository.findById(id).orElse(null);
		if(todo==null)
			return null;
		todo.setCompleted(true);
		repository.save(todo);
		return repository.findById(id).orElse(null);
	}
}