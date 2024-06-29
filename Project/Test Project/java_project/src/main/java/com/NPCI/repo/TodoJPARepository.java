package com.NPCI.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.NPCI.entity.Todo;

//import com.NPCI_Project1.java_project.entities.Todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
 
@Transactional
@Repository
public class TodoJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long save(Todo todo) {
		return entityManager.merge(todo).getId();
	}
}
