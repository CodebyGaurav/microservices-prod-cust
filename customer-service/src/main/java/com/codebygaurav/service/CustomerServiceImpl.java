package com.codebygaurav.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codebygaurav.entity.Customer;
import com.codebygaurav.pojo.MyOrders;
import com.codebygaurav.pojo.Product;
import com.codebygaurav.repo.CustomerRepo;
import com.codebygaurav.service.impl.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Customer saveCustomer(Customer c) {
		return customerRepo.save(c);
	}
	
	public MyOrders getMyOrder(int custId) {
		
	    Optional<Customer> cust =	customerRepo.findById(custId);
	    int pid = cust.get().getPid();
	    
	    
	    Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/"+pid, Product.class);
		
	    MyOrders myOrders = new MyOrders();
	    myOrders.setCustomer(cust.get());
	    myOrders.setProduct(product);
	    return myOrders;
	}
	
}
