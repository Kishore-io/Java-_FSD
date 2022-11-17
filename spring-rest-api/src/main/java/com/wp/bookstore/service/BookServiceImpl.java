package com.wp.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ResponseStatus;

import com.wp.bookstore.model.Book;
import com.wp.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Book getBookById(long id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	

}
