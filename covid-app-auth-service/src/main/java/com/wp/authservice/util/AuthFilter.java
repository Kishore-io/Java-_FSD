package com.wp.authservice.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.wp.authservice.exception.InvalidCredentialException;
import com.wp.authservice.exception.InvalidTokenException;
import com.wp.authservice.model.UserModel;
import com.wp.authservice.service.UserService;

@Component
public class AuthFilter implements Filter {

	@Autowired
	private UserService service;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if(httpRequest.getRequestURI().startsWith("/users")) {
			chain.doFilter(httpRequest, httpResponse);
			return; 
		}
		
		String token = httpRequest.getHeader("token");
		System.out.println("Filter fetched the token-"+token); 
		
		try {
		UserModel user = service.authorizeWithToken(token);
		httpRequest.setAttribute("username", user.getUsername());
		chain.doFilter(httpRequest, httpResponse);
		return;
		}
		catch(InvalidCredentialException | InvalidTokenException ex) {
			httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
		}
		
		
	}

}
