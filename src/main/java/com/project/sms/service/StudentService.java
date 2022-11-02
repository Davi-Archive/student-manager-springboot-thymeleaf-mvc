package com.project.sms.service;

import java.util.List;

import com.project.sms.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student existingStudent);
	
	void deleteStudentById(Long id);
}


