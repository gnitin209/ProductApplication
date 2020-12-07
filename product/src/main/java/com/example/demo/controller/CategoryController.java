package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.exception.ProductApplicationException;
import com.example.demo.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
@Autowired
ICategoryService categoryService;
	public CategoryController() {
		// TODO Auto-generated constructor stub
	}
@PostMapping("/add")
public ResponseEntity<?> addCategory(@RequestBody Category category) throws ProductApplicationException{
	String message=categoryService.addCategory(category);
	return new ResponseEntity<>(message,HttpStatus.ACCEPTED);
	
}
}
