package com.example.demo.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.ErrorResponse;
import com.example.demo.exception.ProductApplicationException;

public class ProductHandler {
	@ExceptionHandler(ProductApplicationException.class)
	public ResponseEntity<ErrorResponse> errorHandler(Exception e) {
		return new ResponseEntity<>(new ErrorResponse(e.getMessage(), e.getCause()),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
