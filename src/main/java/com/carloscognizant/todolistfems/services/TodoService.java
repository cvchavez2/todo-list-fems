package com.carloscognizant.todolistfems.services;

import com.carloscognizant.todolistfems.client.TodoClient;
import com.carloscognizant.todolistfems.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    TodoClient todoClient;

    public String addTodo(Todo newTodo){
        System.out.println(newTodo.getCreatedBy());
        String s = todoClient.addPost(newTodo);
        return s;
    }

    public String getTodos(long id){
        todoClient.getTodos(id);
        return "todo's to return";
    }
}
