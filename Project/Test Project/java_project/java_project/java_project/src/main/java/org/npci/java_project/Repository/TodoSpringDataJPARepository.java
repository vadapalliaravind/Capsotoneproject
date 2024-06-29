package org.npci.java_project.Repository;


import org.npci.java_project.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TodoSpringDataJPARepository extends JpaRepository<Todo, Long> {

}
