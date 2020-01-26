package com.HelloWorld.Todo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class todoHardcodedService {
	
	private static List<Todo>todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "Fred", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "Fred", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "Fred", "Learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}

}
