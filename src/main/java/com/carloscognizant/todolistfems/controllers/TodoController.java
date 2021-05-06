package com.carloscognizant.todolistfems.controllers;

import com.carloscognizant.todolistfems.models.Todo;
import com.carloscognizant.todolistfems.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Todo addTodo(@RequestBody Todo newTodo){
        return todoService.addTodo(newTodo);
    }
}
