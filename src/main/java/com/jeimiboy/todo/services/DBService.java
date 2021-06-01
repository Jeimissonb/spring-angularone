package com.jeimiboy.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Treinar", "Fisiologia do exercício",
				sdf.parse("26/03/2022"), true);
		Todo t3 = new Todo(null, "Caminhar", "Exercício cardiovascular eficiente",
				sdf.parse("27/03/2022" ), false);
		Todo t4 = new Todo(null, "Dormir", "Como ter um sono pesado",
				sdf.parse("28/03/2022" ), true); 
		
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
