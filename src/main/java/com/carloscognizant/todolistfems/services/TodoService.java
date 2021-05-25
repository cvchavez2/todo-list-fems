package com.carloscognizant.todolistfems.services;

import com.carloscognizant.todolistfems.client.TodoClient;
import com.carloscognizant.todolistfems.models.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoClient todoClient;

    public TodoItem addTodo(TodoItem newTodoItem){
        return todoClient.addPost(newTodoItem);
    }

    public TodoItem getTodo(long id){
        return todoClient.getTodo(id);
    }

    public List<TodoItem> getTodos(){
        return todoClient.getTodos();
    }

    public TodoItem updateTodoItem(long id, TodoItem todoItem) {
        return todoClient.updateTodoItem(id, todoItem);
    }
}
