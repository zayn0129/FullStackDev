package com.example.student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service

public class StudentService {
	@GetMapping
	public List<Object> getStudents() {
		return Arrays.asList(
				1L,
				"Mariam",
				"mariam@gmail.com",
				22,
				LocalDate.of(2000, 12, 1));
				
	}
}
