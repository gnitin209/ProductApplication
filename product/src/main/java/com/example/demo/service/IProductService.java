package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.dto.GetProductDto;
import com.example.demo.dto.PostProductDto;
import com.example.demo.entity.Category;
import com.example.demo.exception.service.ProductServiceException;

public interface IProductService {

	String addProduct(PostProductDto product) throws ProductServiceException, IOException;

	GetProductDto getProductByName(String text) throws ProductServiceException;

	GetProductDto getProductByColor(String text) throws ProductServiceException;

	List<GetProductDto> getProductByColor(Category category) throws ProductServiceException;

}
