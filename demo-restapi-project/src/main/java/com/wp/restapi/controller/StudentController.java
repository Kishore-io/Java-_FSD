package com.wp.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.restapi.model.Student;
import com.wp.restapi.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	
	private final StudentService service;

	@Autowired
	public StudentController(StudentService service) {
		this.service=service;	
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> saveUser(@RequestBody Student student){
		Student savedStudent = service.saveStudent(student);
		return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = new ArrayList<>();
		students = service.getAllStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
}
