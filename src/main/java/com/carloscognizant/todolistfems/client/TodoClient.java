package com.carloscognizant.todolistfems.client;

import com.carloscognizant.todolistfems.models.Todo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "todo-crud", url = "${todo.url}")
public interface TodoClient {

    @PostMapping
    Todo addPost(@RequestParam Todo newTodo);
}
