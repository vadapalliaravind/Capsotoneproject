package com.NPCI.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NPCI.entity.Todo;

 
@Repository
public interface TodoSpringDataJPARepository extends JpaRepository<Todo, Long> {

}