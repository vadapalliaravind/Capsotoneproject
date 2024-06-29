package org.npci.java_project.Repository;

import org.npci.java_project.entities.Todo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
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
