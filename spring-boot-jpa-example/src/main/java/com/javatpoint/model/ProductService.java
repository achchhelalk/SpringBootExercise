package com.javatpoint.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.repo.ProductRepo;


@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
    public List<Product> getAllProduct(){
    	List<Product> allProduct = new ArrayList<Product>();
    	productRepo.findAll().forEach(p ->allProduct.add(p));
    	return allProduct;
    }
  /*  
	@Autowired
	private PeopleManangementDao peopleManangementDao;
*/
	public List<Product> listActiveProducts(boolean active) {
		return productRepo.findByActive(active);
	}
	
	public List<Product> listActiveProductsByCategory(boolean active,int categoryId){
		return productRepo.findByActiveAndCategoryId(active,categoryId);
		
	}



}
