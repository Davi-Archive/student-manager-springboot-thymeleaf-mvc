package com.project.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.sms.model.Student;

@Controller
public class StudentController {

	@GetMapping
	List<Student> getAllStudents() {
		
	}
	
}
