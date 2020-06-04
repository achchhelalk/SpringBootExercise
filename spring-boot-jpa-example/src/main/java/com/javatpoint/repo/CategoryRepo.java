package com.javatpoint.repo;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Category;

public interface CategoryRepo extends  CrudRepository<Category,Integer> {

}
