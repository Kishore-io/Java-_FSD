package com.wp.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDetails {

	private String city;
	private String state;
	private String country;
	private Object location;
	private Object current;
}
