package org.npci.java_project.controller;

import java.util.List;

import org.npci.java_project.entities.Todo;
import org.npci.java_project.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping(path="/Todo")
	public ResponseEntity<List<Todo>> getAllUsers(){
		List<Todo> todo =todoService.getAllUsers();
		return new ResponseEntity<>(todo,HttpStatus.OK);
	}
 
	@PostMapping(path="/Todo")
	public ResponseEntity<Todo> createuser(@RequestBody Todo todo){
		Todo todoCreated = todoService.createTodo(todo);
		return new ResponseEntity<>(todoCreated, HttpStatus.CREATED);
				}
}







	
