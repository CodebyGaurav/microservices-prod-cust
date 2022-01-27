package com.codebygaurav.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebygaurav.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
