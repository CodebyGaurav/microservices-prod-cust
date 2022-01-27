package com.codebygaurav.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebygaurav.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	
}
