package com.carloscognizant.todolistfems.services;

import com.carloscognizant.todolistfems.client.TodoClient;
import com.carloscognizant.todolistfems.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    TodoClient todoClient;

    public Todo addTodo(Todo newTodo){
        return new Todo();
    }
}
