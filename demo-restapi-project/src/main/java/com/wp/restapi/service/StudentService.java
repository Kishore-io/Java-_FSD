package com.wp.restapi.service;

import java.util.List;

import com.wp.restapi.model.Student;


public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
}