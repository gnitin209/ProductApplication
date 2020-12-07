package com.example.demo.exception.service.custom;

import com.example.demo.exception.service.ProductServiceException;

public class ProductNotFound extends ProductServiceException {

	public ProductNotFound() {
		// TODO Auto-generated constructor stub
	}

	public ProductNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ProductNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ProductNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ProductNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
