package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.services.ProductServices;

//annotations
@RestController
@RequestMapping("/api/Product")

public class ProductController {
	//annotation
	@Autowired
	ProductServices pservices;
	//annotation
	@PostMapping("/addProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		Product p = pservices.insert(product);
		HttpHeaders headers = new HttpHeaders();
		headers.add("product", "/api/product/addProduct/"+p.getPid());
		return new ResponseEntity<>(p,headers,HttpStatus.OK);
		
	}
		
	}
	
	


