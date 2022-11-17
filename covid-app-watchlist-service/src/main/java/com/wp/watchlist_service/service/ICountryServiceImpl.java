package com.wp.watchlist_service.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.watchlist_service.model.FavCountry;
import com.wp.watchlist_service.repository.ICountryRepo;

@Service
public class ICountryServiceImpl implements ICountryService{

	@Autowired
	ICountryRepo repo;
	
	@Override
	public FavCountry addFavCountry(FavCountry country) {
		
		country.setId(generateId());
		return repo.save(country);
	}

	@Override
	public FavCountry getFavCountry(String countryName) {
		
		return repo.findByCountryName(countryName);
	}

	@Override
	public List<FavCountry> getAllCountries() {
		
		return repo.findAll();
	}
	
	public long generateId() {
		double random = Math.random();
		random*=9999999;
		return (long) random;
	}

}
