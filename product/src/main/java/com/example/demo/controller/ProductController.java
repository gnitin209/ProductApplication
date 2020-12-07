package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PostProductDto;
import com.example.demo.entity.Category;
import com.example.demo.exception.ProductApplicationException;
import com.example.demo.exception.service.ProductServiceException;
import com.example.demo.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	IProductService productService;
	@PostMapping("/add")
    public ResponseEntity<?>addInventory(@RequestBody PostProductDto product) throws ProductApplicationException, IOException {
       String message=productService.addProduct(product);
        System.out.println(message);
        return new ResponseEntity<>(message,HttpStatus.ACCEPTED);
    }
  
	@GetMapping("/findbyname")
	public ResponseEntity<?> findProductByName(@RequestParam("text") String text) throws ProductApplicationException{
		return new ResponseEntity<>(productService.getProductByName(text),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findbycolor")
	public ResponseEntity<?> findProductByColor(@RequestParam("text") String text) throws ProductApplicationException{
		return new ResponseEntity<>(productService.getProductByColor(text),HttpStatus.ACCEPTED);
	}
	@GetMapping("/findbycategory")
	public ResponseEntity<?> findProductByCategory(@RequestBody Category category) throws ProductApplicationException{
		return new ResponseEntity<>(productService.getProductByColor(category),HttpStatus.ACCEPTED);
	}
	
}
