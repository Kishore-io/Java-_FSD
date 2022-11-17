package com.wp.springbootmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:4200")
public class BookRestController {
	
	@Autowired
	private BookService service;
	
	@PostMapping
//	@ResponseStatus(code = HttpStatus.CREATED)
	public Book saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping("/id/{id}")
	public Book getBook(@PathVariable long id) {
		return service.getBook(id);
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	
	@DeleteMapping("/id/{id}")
	public void deleteBook(@PathVariable long id) {
		service.deleteBook(id);
	}
	
	@GetMapping("/title/{title}")
	public Book getBookByTitle(@PathVariable String title) {
		return service.getBookByTitle(title);
	}
	
	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
}
