package com.wp.springbootmongo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.repository.BookRepository;

@ExtendWith(SpringExtension.class)
class BookServiceImplTest {

	@Mock
	BookRepository repo;
	
	@InjectMocks
	BookServiceImpl service;
	
	Book book = null;
	
	public BookServiceImplTest() {
		book = new Book(100102, "Data Structures & Algorithms", "Sandeep Jain", 2500.0f, LocalDate.parse("2022-03-12"));
	}
	
	@Test
	void testSaveBook() {
		when(repo.save(book)).thenReturn(book);
		assertEquals(book, service.saveBook(book));
	}

	@Test
	void testGetBook() {
		when(repo.findById(book.get_id())).thenReturn(Optional.of(book));
		assertNotNull(service.getBook(100102));
	}

	@Test
	void testGetAllBooks() {
		List<Book> books = new ArrayList<>();
		when(repo.findAll()).thenReturn(books);
		assertEquals(books, service.getAllBooks());
	}

//	@Test
//	void testDeleteBook() {
//		when(repo.deleteById(book.get_id())).thenReturn(null);
//	}

	@Test
	void testGetBookByTitle() {
		when(repo.findByTitle(book.getTitle())).thenReturn(book);
//		assertTrue(service.getBookByTitle("Data Structures & Algorithms"));
		assertEquals(book, service.getBookByTitle("Data Structures & Algorithms"));
	}

//	@Test
//	void testUpdateBook() {
//		fail("Not yet implemented");
//	}

}
