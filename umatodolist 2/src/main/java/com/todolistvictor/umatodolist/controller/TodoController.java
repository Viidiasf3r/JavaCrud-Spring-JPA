package com.todolistvictor.umatodolist.controller;

import com.todolistvictor.umatodolist.model.TodoItem;
import com.todolistvictor.umatodolist.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController//fornecendo servicos REST e recebendo JSON
@RequestMapping(value = "/todo")

public class TodoController {

    @Autowired   //controle sobre onde e como a ligação entre os beans deve ser realizada
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findall(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotBlank @RequestBody TodoItem todoItem){
      return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }

}
