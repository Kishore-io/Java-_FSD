package com.wp.springbootmongo.exceptions;

public class DuplicateItemException  extends RuntimeException {
	
	public DuplicateItemException(String message) {
			super(message);
	}
}
