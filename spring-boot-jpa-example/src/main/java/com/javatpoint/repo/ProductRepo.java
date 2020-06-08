package com.javatpoint.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.javatpoint.model.Product;

public interface ProductRepo extends CrudRepository<Product,Integer> {

	List<Product> findByActive(boolean active);
	List<Product> findByActiveAndCategoryId(boolean active,int categoryId);

	//List<Product> findByActive(boolean active);
}
