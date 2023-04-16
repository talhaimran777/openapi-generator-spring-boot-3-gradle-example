package com.youtube.openapigenerator;

import java.util.List;

import org.openapi.todos.api.TodosApi;
import org.openapi.todos.model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class TodosController implements TodosApi {

	@Override
	public ResponseEntity<List<Todo>> todosGet() {
		Todo todo1 = new Todo();
		todo1.setTitle("Play Valorant!");
		todo1.setCompleted(false);

		Todo todo2 = new Todo();
		todo2.setTitle("Play PUBG!");
		todo2.setCompleted(true);

		return ResponseEntity.ok(List.of(todo1, todo2));
	}

	@Override
	public ResponseEntity<Todo> todosPost(@Valid Todo todo) {
		return ResponseEntity.ok(todo);
	}
}
