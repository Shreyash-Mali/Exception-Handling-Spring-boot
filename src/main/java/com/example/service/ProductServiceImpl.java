package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ProductRepository;
import com.example.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;

	@Override
	public Product createProduct(Product product) {
		return repository.save(product);
	}

}
