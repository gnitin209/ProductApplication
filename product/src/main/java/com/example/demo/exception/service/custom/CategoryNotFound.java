package com.example.demo.exception.service.custom;

import com.example.demo.exception.service.ProductServiceException;

public class CategoryNotFound extends ProductServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CategoryNotFound() {
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
