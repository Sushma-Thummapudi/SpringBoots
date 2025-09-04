package com.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repository.ProductRepository;
//annotation
@Service
public class ProductServiceImpl implements ProductServices {
	//annotation
	@Autowired
	
	ProductRepository prepo;
	
	public Product insert(Product p) {
		return prepo.save(p);
	}
	
	

	}

	


