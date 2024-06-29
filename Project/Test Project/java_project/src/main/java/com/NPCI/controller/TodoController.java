package com.NPCI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NPCI.entity.Todo;
import com.NPCI.service.TodoService;


@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping(path="/todos")
    public ResponseEntity<List<Todo>> getAllUsers() {
        List<Todo> todos = todoService.getAllUsers();
        return ResponseEntity.ok(todos);
    }
	
	@PatchMapping(path="/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable int id) {
        Todo updatedTodo = todoService.updateStatusTodo(id);
        if (updatedTodo != null) {
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	
	
	
	@PutMapping(path="/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        todo.setId(id);
        Todo updatedTodo = todoService.updateTodo(todo);
        if (updatedTodo != null) {
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	
	
	
	@PostMapping(path="/todo")
	public ResponseEntity<Todo> createuser(@RequestBody Todo todo){
		Todo todoCreated = todoService.createTodo(todo);
		return new ResponseEntity<>(todoCreated, HttpStatus.CREATED);
				}
	
	@GetMapping(path="/todos/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        if (todo != null) {
            return ResponseEntity.ok(todo);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	
	@DeleteMapping(path = "/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        Todo deletedTodo = todoService.deleteTodo(id);
        if (deletedTodo != null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}


