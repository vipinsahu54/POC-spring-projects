package com.infogain.Assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infogain.Assignment.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	private List<Product> productList=new ArrayList<>();
	
	@Override
	public List<Product> getProducts() {
		return productList;
	}

	@Override
	public void addProduct(Product product) {
		this.productList.add(product);
	}

}
