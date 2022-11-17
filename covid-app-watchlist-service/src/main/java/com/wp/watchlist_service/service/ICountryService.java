package com.wp.watchlist_service.service;

import java.util.List;

import com.wp.watchlist_service.model.FavCountry;

public interface ICountryService {

	public FavCountry addFavCountry(FavCountry country);
	
	public FavCountry getFavCountry(String countryName);
	
	public List<FavCountry> getAllCountries();
}
