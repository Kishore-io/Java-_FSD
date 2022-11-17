package com.wp.springmvc.repository;

import java.sql.SQLException;
import java.util.List;

import com.wp.springmvc.modal.Book;

public interface BookRepository {

	public Book saveBook(Book book) ;
	
	public Book getBookByTitle(String title);
	
	public List<Book> getAllBooks();
	
	
	
	public Book updateBook(Book book);
	
	
	
}
