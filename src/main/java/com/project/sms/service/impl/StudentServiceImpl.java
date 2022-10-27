package com.project.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sms.model.Student;
import com.project.sms.repository.StudentRepository;
import com.project.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
}
