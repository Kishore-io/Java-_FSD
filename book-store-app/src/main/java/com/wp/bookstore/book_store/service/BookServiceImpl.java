package com.wp.bookstore.book_store.service;

import java.sql.SQLException;
import java.util.List;

import com.wp.bookstore.book_store.model.Book;
import com.wp.bookstore.book_store.repository.BookRepository;
import com.wp.bookstore.book_store.repository.BookRepositoryImpl;
import com.wp.bookstore.book_store.repository.BookRepositoryJpaImpl;

public class BookServiceImpl implements BookService {
	
	private BookRepository repo;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
		repo = new BookRepositoryJpaImpl();
	}

	@Override
	public Book saveBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return repo.saveBook(book);
	}

	@Override
	public Book getBookByTitle(String title) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getBookByTitle(title);
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllBooks();
	}

	@Override
	public boolean deleteBook(String title) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deleteBook(title);
	}

	@Override
	public Book updateBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return repo.updateBook(book);
	}

	@Override
	public Book getBookById(long id) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getBookById(id);
	}

	@Override
	public boolean deleteBook(long id) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deleteBook(id);
	}
	
}
