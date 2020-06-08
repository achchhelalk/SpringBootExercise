package com.javatpoint.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.repo.CategoryRepo;

@Service
public class CategoryService {
    @Autowired
	CategoryRepo categoryRepo;
    public List<Category> getAllCategory(){
    	List<Category> allCategory = new ArrayList<Category>();
    	categoryRepo.findAll().forEach(c ->allCategory.add(c));
    	return allCategory;
    }
    
    public Category getCategoryById(int id) {
    
    	return categoryRepo.findById(id).orElse(null);
    }
}
