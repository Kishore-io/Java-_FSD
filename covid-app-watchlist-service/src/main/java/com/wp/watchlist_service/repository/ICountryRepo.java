package com.wp.watchlist_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wp.watchlist_service.model.FavCountry;

public interface ICountryRepo extends MongoRepository<FavCountry, Long> {
	
	public FavCountry findByCountryName(String countryName);
	
}
