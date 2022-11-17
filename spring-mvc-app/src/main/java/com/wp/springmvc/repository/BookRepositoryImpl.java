package com.wp.springmvc.repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wp.springmvc.modal.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	Map<String, Book> bookDb;
	
	@PostConstruct
	public void init() {
		bookDb = new HashMap<String, Book>();
	}

	@Override
	public Book saveBook(Book book) {
		bookDb.put(book.getTitle(), book);
		return book;
	}

	@Override
	public Book getBookByTitle(String title)  {
		return bookDb.get(title);
	}

	@Override
	public List<Book> getAllBooks()  {
		List<Book> allBooks = new ArrayList<>(bookDb.values());
		return allBooks;
	}

	@Override
	public Book updateBook(Book book)  {
		bookDb.put(book.getTitle(), book);
		return book;
	}

}
