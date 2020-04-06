package com.mcart.UsersMS.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class McartException extends Exception {

	private static final long serialVersionUID = 1L;

	public McartException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public McartException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public McartException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public McartException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public McartException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
