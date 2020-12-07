package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;


public interface IProductRepository extends JpaRepository<Product, Integer> {
	public Optional<Product> findByProductName(String productName);
	public Optional<Product> findByProductColor(String productName);
	

}
