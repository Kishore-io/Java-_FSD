package com.wp.springbootmongo.service;

import java.util.List;

import com.wp.springbootmongo.model.Book;


public interface BookService {
	
	public Book saveBook(Book book);
	
	public Book getBook(long id);
	
	public List<Book> getAllBooks();
	
	public void deleteBook(long id);
	
	public Book getBookByTitle(String title);
	
	public Book updateBook(Book book);
}
