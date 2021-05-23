package com.jeimiboy.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeimiboy.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
