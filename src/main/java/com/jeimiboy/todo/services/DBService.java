package com.jeimiboy.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeimiboy.todo.domain.Todo;
import com.jeimiboy.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);
		Todo t2 = new Todo(null, "Treinar", "Fisiologia do exercício",
				LocalDateTime.parse("26/03/2022 11:40", formatter), true);
		Todo t3 = new Todo(null, "Caminhar", "Exercício cardiovascular eficiente",
				LocalDateTime.parse("27/03/2022 12:40", formatter), false);
		Todo t4 = new Todo(null, "Dormir", "Como ter um sono pesado",
				LocalDateTime.parse("28/03/2022 13:40", formatter), true);
		
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
