package com.carloscognizant.todolistfems.client;

import com.carloscognizant.todolistfems.models.TodoItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "todo-crud", url = "${todo.url}")
public interface TodoClient {

    @PostMapping(path = "/todoitems", consumes = "application/json")
    TodoItem addPost(@RequestBody TodoItem newTodoItem);

    @GetMapping(path = "/todoitems/{id}")
    TodoItem getTodo(@PathVariable long id);

    @GetMapping(path = "/todoitems")
    List<TodoItem> getTodos();

    @PutMapping(path = "/todoitems/{id}")
    TodoItem updateTodoItem(@PathVariable long id, @RequestBody TodoItem todoItem);
}