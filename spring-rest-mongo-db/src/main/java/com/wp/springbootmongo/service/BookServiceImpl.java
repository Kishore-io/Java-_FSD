package com.wp.springbootmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.springbootmongo.exceptions.DuplicateItemException;
import com.wp.springbootmongo.exceptions.ItemNotFoundException;
import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository repo;

	@Override
	public Book saveBook(Book book) {
		if(repo.existsById(book.get_id())) {
			throw new DuplicateItemException("Item with Id "+book.get_id()+" Already Exists");
		}
		
		return repo.save(book);
	}

	@Override
	public Book getBook(long id) {
		
//		if(!repo.existsById(id)) {
//			throw new ItemNotFoundException("Item with Id: "+id+" not found");
//		}
		
//		return repo.findById(id).get();
		return repo.findById(id).orElseThrow(()-> 
		new ItemNotFoundException("Item with Id: "+id+ " not found"));
	}

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	@Override
	public void deleteBook(long id) {
		if(!repo.existsById(id)){
			throw new ItemNotFoundException("Item with Id "+id+"not found to delete");
		}
		repo.deleteById(id);
	}
	
	@Override
	public Book getBookByTitle(String title) {
		return repo.findByTitle(title);
	}

	@Override
	public Book updateBook(Book book) {
		return repo.save(book);
	}
	
	
}
