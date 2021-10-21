package com.infogain.Assignment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.Assignment.model.Product;
import com.infogain.Assignment.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/product")
	public ModelAndView getProduct() {
		ModelAndView view = new ModelAndView("product");
	    view.addObject("products", productService.getProducts());

	    return view;
	}
	
	@GetMapping(value = "/add")
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("add");
	    mav.addObject("add", new Product());

	    return mav;
	}
	
	@PostMapping(value = "/addproduct")
	public ModelAndView addProduct(@ModelAttribute("add") Product product) {
		productService.addProduct(product);
		ModelAndView mav = new ModelAndView("add");
	    mav.addObject("add", new Product());

	    return mav;
	}
	
	@GetMapping(value = "/home")
	public ModelAndView getString() {
		ModelAndView view = new ModelAndView("home");

	    return view;
	}
}
