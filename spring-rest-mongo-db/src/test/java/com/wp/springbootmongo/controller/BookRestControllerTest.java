package com.wp.springbootmongo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.wp.springbootmongo.model.Book;
import com.wp.springbootmongo.service.BookService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = BookRestController.class)
class BookRestControllerTest {

	@MockBean
	BookService service;

	@Autowired
	private MockMvc mockMvc;

	Book book = null;

	public BookRestControllerTest() {
		book = new Book(100102, "Data Structures & Algorithms", "Sandeep Jain", 2500.0f, LocalDate.parse("2022-03-12"));
	}

	@Test
	void testSaveBook() throws Exception {
		when(service.saveBook(book)).thenReturn(book);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/books")
				.contentType("application/json")
				.content("{\"title\":\"Data Structures & Algorithms\",\"author\":\"Sandeep Jain\",\"price\":2500.0,\"datePublished\":\"2022-03-12\",\"id\":100102}");
		
		mockMvc.perform(requestBuilder)
			   .andExpect(status().isOk())
			   .andReturn();
	}

	@Test
	void testGetBook() throws Exception {
		when(service.getBook(book.get_id())).thenReturn(book);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/books/id/100102");
		mockMvc.perform(requestBuilder)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"title\":\"Data Structures & Algorithms\",\"author\":\"Sandeep Jain\",\"price\":2500.0,\"datePublished\":\"2022-03-12\",\"id\":100102}"))
				.andReturn();
	}

//	@Test
//	void testGetAllBooks() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteBook() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetBookByTitle() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateBook() {
//		fail("Not yet implemented");
//	}

}
