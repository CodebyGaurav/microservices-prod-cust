package com.codebygaurav.services.impl;

import java.util.List;
import java.util.Optional;

import com.codebygaurav.entity.Product;

public interface ProductServiceImpl {

	public List<Product> getAllProduct();
	
	public Optional<Product> getProductById(int pid);
	
	public Product saveProduct(Product product);
}
