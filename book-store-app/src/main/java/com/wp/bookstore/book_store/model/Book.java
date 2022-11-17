package com.wp.bookstore.book_store.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_db")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 50, unique = true)
	private String title;
	private String author;
	private float price;
	private LocalDate datePublished;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Book(String title, String author, float price, LocalDate datePublished) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.datePublished = datePublished;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", datePublished=" + datePublished
				+ "]";
	}
	
	
	
}
