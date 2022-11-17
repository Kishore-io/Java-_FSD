package com.wp.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	@Id
	private int rollNo;
	private String firstname;
	private String lastname;
	private String schoolName;
	private int age;
}
