package com.codebygaurav.service.impl;

import com.codebygaurav.entity.Customer;
import com.codebygaurav.pojo.MyOrders;

public interface CustomerService {

	public Customer saveCustomer(Customer c);
	
	public MyOrders getMyOrder(int custId);
}
