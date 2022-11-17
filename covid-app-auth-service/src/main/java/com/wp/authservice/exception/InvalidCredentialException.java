package com.wp.authservice.exception;

public class InvalidCredentialException extends RuntimeException {

	public InvalidCredentialException(String message) {
		super(message);
	}
}
