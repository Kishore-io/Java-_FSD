package com.wp.watchlist_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.watchlist_service.model.FavCountry;
import com.wp.watchlist_service.service.ICountryService;

@RestController
@RequestMapping("/watchlists")
public class FavCountryController {

	@Autowired
	ICountryService service;
	
	@PostMapping("/favcountry")
	public FavCountry addCountry(@RequestBody FavCountry country) {
		return service.addFavCountry(country);
	}
	
	@GetMapping("/favcountry")
	public List<FavCountry> getWatchlist(){
		return service.getAllCountries();
	}
	
}
