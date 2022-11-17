package com.wp.bookstore.book_store.service;

import java.sql.SQLException;
import java.util.List;

import com.wp.bookstore.book_store.model.Book;

public interface BookService {
public Book saveBook(Book book) throws SQLException;
	
	public Book getBookByTitle(String title) throws SQLException;
	
	public List<Book> getAllBooks() throws SQLException;
	
	public boolean deleteBook(String title) throws SQLException;
	
	public Book updateBook(Book book) throws SQLException;
	
	public Book getBookById(long id) throws SQLException;
	
	public boolean deleteBook(long id) throws SQLException;

}
