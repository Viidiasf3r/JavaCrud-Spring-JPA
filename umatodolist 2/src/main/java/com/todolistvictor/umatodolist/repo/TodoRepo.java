package com.todolistvictor.umatodolist.repo;

import com.todolistvictor.umatodolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
