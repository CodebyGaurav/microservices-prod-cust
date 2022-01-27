package com.codebygaurav.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebygaurav.entity.Product;
import com.codebygaurav.services.impl.ProductServiceImpl;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	 ProductServiceImpl productServiceImpl;
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return productServiceImpl.getAllProduct();
	}
	
	@PostMapping("/")
	public Product saveProducts(@RequestBody Product product){
		return productServiceImpl.saveProduct(product);
	}
	
	@GetMapping("{id}")
	public Optional<Product> getProductByID(@PathVariable("id") int pid){
		return productServiceImpl.getProductById(pid);
	}
}
