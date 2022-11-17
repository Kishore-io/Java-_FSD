package com.wp.country_service.service;

import java.util.List;

import com.wp.country_service.model.Country;
import com.wp.country_service.model.FavCountry;

public interface ICountryService {

	public Country getCountryInfo(String countryName);
	
	public FavCountry addToFavCountry(String countryName);
	
	public List<FavCountry> getWatchlist();
}
