package com.wp.springmvc.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping("/hello") 
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		LocalDate date = LocalDate.now();
		mv.setViewName("show");
		mv.addObject("currentDate", date);
		return mv;
	}
	
	@PostMapping("/add-name")
	public ModelAndView addName(@RequestParam("username") String username) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show-user");
		mv.addObject("user", username);
		return mv;
	}
}
