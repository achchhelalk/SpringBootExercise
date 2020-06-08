package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Product;
import com.javatpoint.model.ProductService;

@RestController
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	ProductService productService;
	Product product;

	@RequestMapping("/admin/all/products")
	@ResponseBody
	public List<Product> getAllProduct() {		
		return  productService.getAllProduct();
				
	}	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> listActiveProducts() {
		
		return productService.listActiveProducts(true);
				
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		
		return productService.listActiveProductsByCategory(true,id);
				
	}
	

}
