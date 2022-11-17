package com.wp.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.wp.restapi.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
