package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Product;
//annotation
@Repository


public interface ProductRepository extends JpaRepository<Product,Integer>{

}
