package com.wp.country_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.country_service.model.Country;
import com.wp.country_service.model.FavCountry;
import com.wp.country_service.service.ICountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	ICountryService service;
	
	@GetMapping("/{countryName}")
	public Country getCountryInfo(@PathVariable String countryName) {
		
		return service.getCountryInfo(countryName);
	}
	
	@GetMapping("/watchlist/{countryName}")
	public FavCountry addToWatchlist(@PathVariable String countryName) {
		
		return service.addToFavCountry(countryName);
	}
	
	@GetMapping("/watchlist")
	public List<FavCountry> getWatchlist(){
		return service.getWatchlist();
	}
	
}
