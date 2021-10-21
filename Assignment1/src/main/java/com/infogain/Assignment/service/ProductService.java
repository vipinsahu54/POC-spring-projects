package com.infogain.Assignment.service;

import java.util.List;

import com.infogain.Assignment.model.Product;

public interface ProductService {

	public List<Product> getProducts();
	public void addProduct(Product product);
	
}
