package com.javatpoint;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatpoint.model.Product;
import com.javatpoint.model.ProductService;
@SpringBootApplication
public class SpringBootJpaExampleApplication 
{
	@Autowired
	private ProductService productService;
	

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootJpaExampleApplication.class, args);
	}
	//Practice
	public void run(String... args) throws Exception {
		//listActiveProducts();
		//listActiveProductsByCategory();
	}

	private void listActiveProductsByCategory() {
		List<Product> personList = productService.listActiveProductsByCategory(true,3);
		personList.forEach(System.out::println);
	}
	/*
	private void getPersonsInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Murphy");
		personList.forEach(System.out::println);
	}
	
	*/
	private void listActiveProducts() {
		List<Product> productList = productService.listActiveProducts(true);
		productList.forEach(System.out::println);
	}
	
	
}
