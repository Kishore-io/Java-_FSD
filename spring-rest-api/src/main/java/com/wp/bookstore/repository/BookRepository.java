package com.wp.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wp.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
