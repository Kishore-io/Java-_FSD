package com.wp.springmvc.modal;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// It is a application in which the Spring MVC is connected to spring Data Jpa
//and storing book information in the mysql database.

@Entity
@Table(name="book_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 50,unique = true, nullable = false)
	private String title;
	private String author;
	private float price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datePublished;
	
		
}
