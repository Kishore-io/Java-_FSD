package com.wp.springbootmongo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("book")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	@JsonProperty("id")
	private long _id;
	private String title;
	private String author;
	private float price;
	private LocalDate datePublished;
}
