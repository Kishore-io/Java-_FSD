package com.wp.springmvc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wp.springmvc.modal.Book;
import com.wp.springmvc.repository.BookRepository;
import com.wp.springmvc.service.BookService;

@Controller
public class BookController {
	
//	@Autowired
//	private BookRepository repo;
	
	@Autowired
	private BookService service;
	
	@PostMapping("/add-book")
	public String addBook(@ModelAttribute Book book,Model model) {
		Book savedBook = service.saveBook(book);
		model.addAttribute("book", savedBook);
		return "show-book";
	}
	
	
	
//	@PostMapping("/add-book")
//	public ModelAndView addBook(@ModelAttribute Book book) {
//		Book savedBook = repo.saveBook(book);
//		ModelAndView mv = new ModelAndView("show-book");
//		mv.addObject("book", savedBook);
//		return mv;
//	}
	
//	@PostMapping("/add-book")
//	public String addBook(@ModelAttribute("book") Book book) {
//		repo.saveBook(book);
//		return "show-book";
//	}
	
//	@GetMapping("/find-book")
//	public ModelAndView findBook(@RequestParam("title") String title) {
//		Book book = repo.getBookByTitle(title);
//		ModelAndView mv = new ModelAndView("show-book");
//		mv.addObject("book", book);
//		return mv;
//	}
	
	@GetMapping("/find-book")
	public String findBook(@RequestParam("title") String title, Model model) {
		Book book = service.getBookByTitle(title);
		model.addAttribute("book", book);
		return "show-book";
	}
	
	@ResponseBody
	@GetMapping("/find-all-book")
	public List<Book> findAllBook() {
		List<Book> allBooks = service.getAllBooks();
		return allBooks;
	}
}
