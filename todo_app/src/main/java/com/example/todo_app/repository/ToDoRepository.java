package com.example.todo_app.repository;

import com.example.todo_app.domain.ToDo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

}
