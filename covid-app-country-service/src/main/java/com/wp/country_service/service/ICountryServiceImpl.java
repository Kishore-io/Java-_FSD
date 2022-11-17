package com.wp.country_service.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wp.country_service.model.Country;
import com.wp.country_service.model.FavCountry;

@Service
public class ICountryServiceImpl implements ICountryService{

	@Autowired
	@Qualifier("rt-with eureka")
	RestTemplate rte;
	
	@Autowired
	@Qualifier("rt-without-eureka")
	RestTemplate rt;
	
	@Value("${BASE_URL}")
	private String baseUrl;
	@Value("${WATCH_SERVICE_URL}")
	private String watchlistServiceUrl;
	
	@Override
	public Country getCountryInfo(String countryName) {
		
		Country country = rt.getForObject(baseUrl+countryName, Country.class);
		return country;
		
	}

	@Override
	public FavCountry addToFavCountry(String countryName) {
			
			FavCountry country = new FavCountry();
			country.setCountryName(countryName);
			FavCountry addedCountry = rte.postForObject(watchlistServiceUrl+"/favcountry", country, FavCountry.class);
		
		return addedCountry;
	}

	@Override
	public List<FavCountry> getWatchlist() {
		
		FavCountry[] favCountries = rte.getForObject(watchlistServiceUrl+"/favcountry", FavCountry[].class);
		List<FavCountry> list = Arrays.asList(favCountries);
		return list;
		
	}

}
