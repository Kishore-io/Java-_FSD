package com.wp.country_service.model;

import lombok.Data;

//Service Registry : Whenever the services gets starts running,it gets registered in the eureka server.It's called Service registry.
//Service Discovery : Whenever the one service gets call to another service , then it try to find out the service in the eureka server.It's called the Service Discovery.
//Load Balancer : Whenever the service is running in many ports in eureka server, finding the appropriate one is called Load Balancing.

@Data
public class Country {

	private Details confirmed;
	private Details recovered;
	private Details deaths;
}
