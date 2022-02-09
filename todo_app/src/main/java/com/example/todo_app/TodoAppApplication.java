package com.example.todo_app;

import com.example.todo_app.domain.ToDo;
import com.example.todo_app.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired
	public ToDoRepository toDoRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<ToDo> toDos = Arrays.asList(new ToDo("Play volleyball", "No"),
				new ToDo("Cooking", "Yes"));
		toDos.forEach(toDoRepository::save);
	}
}
