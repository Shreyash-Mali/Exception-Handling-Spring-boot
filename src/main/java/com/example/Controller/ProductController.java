package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping("/create")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		System.out.println(product);
	    return new ResponseEntity<>(service.createProduct(product), HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getall(){
		return new ResponseEntity<>(service.grtAllProduct(),HttpStatus.OK);
	}
	
	
}
