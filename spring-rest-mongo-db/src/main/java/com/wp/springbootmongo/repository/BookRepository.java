package com.wp.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wp.springbootmongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Long>{
	
	public Book findByTitle(String title);
}
