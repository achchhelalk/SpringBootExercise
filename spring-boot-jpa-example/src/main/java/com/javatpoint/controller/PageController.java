package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.model.Category;
import com.javatpoint.model.CategoryService;

@RestController
public class PageController {

	@Autowired
	CategoryService categoryService;
	Category category;


	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Home");		
		//passing the list of categories
		mv.addObject("categories", categoryService.getAllCategory());	
		mv.addObject("userClickHome",true);
		return mv;				
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");	
		mv.addObject("userClickAbout",true);	

		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");	
		mv.addObject("userClickContact",true);	

		return mv;
	}

	/*
	 * Method to load all the products
	 */

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");

		//passing the list of categories
		mv.addObject("categories", categoryService.getAllCategory());

		mv.addObject("userClickAllProducts",true);	

		return mv;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		//Fetch a single category
		Category category=null;
		category = this.categoryService.getCategoryById(id);
		mv.addObject("title",category.getName());

		//passing the list of categories
		mv.addObject("categories", categoryService.getAllCategory());

		//passing single of categories
		mv.addObject("category", category);
		System.out.println("Category:"+category.getName());
		mv.addObject("userClickcategoryProducts",true);	

		return mv;
	}

}

