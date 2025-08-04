package com.example.service;

import com.example.entity.Product;

import java.util.List;

public interface ProductService {
	public Product createProduct(Product product);
	public List<Product> grtAllProduct();

	public Product getById(Long id);


}
