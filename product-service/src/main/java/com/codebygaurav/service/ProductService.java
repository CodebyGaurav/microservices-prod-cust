package com.codebygaurav.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebygaurav.entity.Product;
import com.codebygaurav.repo.ProductRepo;
import com.codebygaurav.services.impl.ProductServiceImpl;

@Service
public class ProductService implements ProductServiceImpl{

	@Autowired
	private ProductRepo productRepo;
	
	
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(int pid){
		return productRepo.findById(pid);
	}
	
	public Product saveProduct(Product product){
		return productRepo.save(product);
	}
	
	
}
