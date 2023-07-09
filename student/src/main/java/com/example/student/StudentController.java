package com.example.student;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
	private final StudentService studentService;


	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
		
	}
	
	@GetMapping
	public List<Object> getStudents() {
		return studentService.getStudents();
	
	
	}}

	
	


