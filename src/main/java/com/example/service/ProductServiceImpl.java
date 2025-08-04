package com.example.service;

import com.example.Exception.DuplicateProductException;

import com.example.Exception.ProductNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ProductRepository;
import com.example.entity.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;

	@Override
	public Product createProduct(Product product) {
		Optional<Product> existingProduct = repository.findByName(product.getName());

		if (existingProduct.isPresent()) {
			throw new DuplicateProductException("Product with this name"+" "+product.getName()+" "+"already exists.");
		}

		return repository.save(product);
	}

	@Override
	public List<Product> grtAllProduct() {
		return repository.findAll();
	}


	@Override
	public Product getById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ProductNotFountException("Data Not found with id: " + id));
	}



}
