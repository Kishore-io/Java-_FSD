package com.wp.springbootmongo.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wp.springbootmongo.dto.ErrorResponseDto;
import com.wp.springbootmongo.exceptions.DuplicateItemException;
import com.wp.springbootmongo.exceptions.ItemNotFoundException;

// Centralized Error Handling or Global Exception Handling

@RestControllerAdvice
public class BookErrorController {

	HttpStatus status;
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<ErrorResponseDto> handleNotFoundException(Exception ex,HttpServletRequest request){
		status = HttpStatus.NOT_FOUND;
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now(),
														status.value(),
														status.getReasonPhrase(), 
														ex.getMessage(), 
														request.getRequestURI());
		
		return ResponseEntity.status(status).body(errorObj); 
		
	}
	
	@ExceptionHandler(DuplicateItemException.class)
	public ResponseEntity<ErrorResponseDto> handleItemAlreadyExistsException(Exception ex,HttpServletRequest request){
		status = HttpStatus.CONFLICT;
		
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now(),
				                                         status.value(),
				                                         status.getReasonPhrase(),
				                                         ex.getMessage(),
				                                         request.getRequestURI());
		return ResponseEntity.status(status).body(errorObj);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseDto> handleOtherException(Exception ex,HttpServletRequest request){
		status = HttpStatus.INTERNAL_SERVER_ERROR;
		
		ErrorResponseDto errorObj = new ErrorResponseDto(LocalDateTime.now(),
				                                         status.value(),
				                                         status.getReasonPhrase(),
				                                         ex.getMessage(),
				                                         request.getRequestURI());
		return ResponseEntity.status(status).body(errorObj);
	}
}
