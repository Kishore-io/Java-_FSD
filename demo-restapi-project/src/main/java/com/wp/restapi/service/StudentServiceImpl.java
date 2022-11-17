package com.wp.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.restapi.model.Student;
import com.wp.restapi.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private final StudentRepository repo;
	
	@Autowired
	public StudentServiceImpl(StudentRepository repo) {
		this.repo=repo;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repo.findAll();
	}

}
