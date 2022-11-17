package com.wp.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wp.springmvc.modal.Book;

public interface BookJpaRepository extends JpaRepository<Book, Long> {
	Book findByTitle(String title);
}
