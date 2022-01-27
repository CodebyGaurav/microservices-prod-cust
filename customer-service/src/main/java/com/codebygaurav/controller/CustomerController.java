package com.codebygaurav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebygaurav.entity.Customer;
import com.codebygaurav.pojo.MyOrders;
import com.codebygaurav.service.impl.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/myorders/{cid}")
	public MyOrders myProductOrders(@PathVariable("cid") int custId) {
		
		return customerService.getMyOrder(custId);
	}
	
	
}
