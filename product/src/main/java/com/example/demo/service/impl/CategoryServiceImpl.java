package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.ICategoryRepository;
import com.example.demo.service.ICategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService{

	public CategoryServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired 
	ICategoryRepository categoryRepo;
	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
	categoryRepo.save(category);
		return "Category Added";
	}

}