package com.carloscognizant.todolistfems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TodoListFemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListFemsApplication.class, args);
	}

}
