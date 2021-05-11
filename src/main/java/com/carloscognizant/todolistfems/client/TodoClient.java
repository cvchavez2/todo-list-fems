package com.carloscognizant.todolistfems.client;

import com.carloscognizant.todolistfems.models.Todo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "todo-crud", url = "${todo.url}")
public interface TodoClient {

    @PostMapping(path = "/todoitems", consumes = "application/json")
    Todo addPost(@RequestBody Todo newTodo);

    @GetMapping(path = "/todoitems")
    Todo getTodo(@RequestParam(value = "id") long id);
}
