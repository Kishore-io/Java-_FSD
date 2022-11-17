package com.wp.watchlist_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("country")
@Data
public class FavCountry {

	@Id
	private long id;
	private String countryName;
}
