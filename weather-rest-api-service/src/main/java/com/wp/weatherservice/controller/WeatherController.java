package com.wp.weatherservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wp.weatherservice.model.StateInfo;
import com.wp.weatherservice.model.WeatherCity;
import com.wp.weatherservice.model.WeatherCountry;
import com.wp.weatherservice.model.CityDetails;
import com.wp.weatherservice.model.CityDetailsInfo;
import com.wp.weatherservice.model.CityInfo;
import com.wp.weatherservice.model.CountryInfo;
import com.wp.weatherservice.model.WeatherState;

@RestController
public class WeatherController {
	
	@Autowired
	private RestTemplate restTemplate;

	String baseUrl = "http://api.airvisual.com/v2/countries?key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f";
//	@GetMapping("/countries")
//	public ResponseEntity<?> getAllCountries(){
//		
//		String allCountries =  restTemplate.getForObject(baseUrl, String.class);
//		
////		List<WeatherCountry> list = Arrays.asList(allCountries);
//		
//		return new ResponseEntity<>(allCountries,HttpStatus.OK);
//	}
	
	
	@GetMapping("/countries")
	public ResponseEntity<?> getAllCountries(){
		
		CountryInfo response =
				  restTemplate.getForObject(baseUrl,CountryInfo.class);
		
		WeatherCountry[] countries = response.getData();
						
		return new ResponseEntity<>(countries,HttpStatus.OK);
	}
	
	
	@GetMapping("/states/{countryName}")
	public ResponseEntity<?> getAllStates(@PathVariable String countryName){
		
		StateInfo response =
				  restTemplate.getForObject("http://api.airvisual.com/v2/states?country="+countryName+"&key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f",StateInfo.class);
		
		WeatherState[] states = response.getData();
		
				
		return new ResponseEntity<>(states,HttpStatus.OK);
	}
	
	
	@GetMapping("/cities/{countryName}/{stateName}")
	public ResponseEntity<?> getAllCities(@PathVariable String countryName,@PathVariable String stateName){
		
		CityInfo response =
				  restTemplate.getForObject("http://api.airvisual.com/v2/cities?state="+stateName+"&country="+countryName+"&key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f",CityInfo.class);
		
		WeatherCity[] cities = response.getData();
		
				
		return new ResponseEntity<>(cities,HttpStatus.OK);
	}
	
	@GetMapping("/getCityDetails/{countryName}/{stateName}/{cityName}")
	public ResponseEntity<?> getAllDetailsOfCity(@PathVariable String countryName,@PathVariable String stateName,@PathVariable String cityName){
		
		CityDetailsInfo response =
				  restTemplate.getForObject("http://api.airvisual.com/v2/city?city="+cityName+"&state="+stateName+"&country="+countryName+"&key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f",CityDetailsInfo.class);
		
		CityDetails details =  response.getData();
				
		return new ResponseEntity<>(details,HttpStatus.OK);
	}
	
	
	@GetMapping("/getNearestCity")
	public ResponseEntity<?> getNearestCity(){
		
		CityDetailsInfo response =
				  restTemplate.getForObject("http://api.airvisual.com/v2/nearest_city?key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f",CityDetailsInfo.class);
		
		CityDetails details =  response.getData();
				
		return new ResponseEntity<>(details,HttpStatus.OK);
	}
	
	@GetMapping("/getCityByLatAndLong/{latitude}/{longitude}")
	public ResponseEntity<?> getCityByLatAndLong(@PathVariable double latitude, @PathVariable double longitude){
		
		CityDetailsInfo response =
				  restTemplate.getForObject("http://api.airvisual.com/v2/nearest_city?lat="+latitude+"&lon="+longitude+"&key=d41efd44-7c87-4ec9-86cf-fcb40e012a5f",CityDetailsInfo.class);
		
		CityDetails details =  response.getData();
				
		return new ResponseEntity<>(details,HttpStatus.OK);
	}
	
	
	

	
}
