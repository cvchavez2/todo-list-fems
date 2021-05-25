package com.carloscognizant.todolistfems.controllers;

import com.carloscognizant.todolistfems.models.TodoItem;
import com.carloscognizant.todolistfems.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoitems")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }


    @PostMapping(consumes = "application/json", produces = "application/json")
    public TodoItem addTodo(@RequestBody TodoItem newTodoItem){
        return todoService.addTodo(newTodoItem);
    }

    @GetMapping("/{id}")
    public TodoItem getTodo(@PathVariable long id){
        System.out.println("id: " + id);
        return todoService.getTodo(id);
    }
    @GetMapping()
    public List<TodoItem> getTodos(){
        return todoService.getTodos();
    }
    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable long id, @RequestBody TodoItem todoItem){
        return todoService.updateTodoItem(id, todoItem);
    }
}
