package com.todo.rest.webservices.todobackend.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList();
	private static long idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "in28min", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "in28min", "Learn to MICROSERVICE", new Date(), false));
		todos.add(new Todo(++idCounter, "in28min", "Learn to ANGULAR", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;

	}
}
