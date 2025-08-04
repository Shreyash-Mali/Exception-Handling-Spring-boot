package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Product;
import com.example.service.ProductService;

import java.util.List;

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
<<<<<<< HEAD
	public ResponseEntity<List<Product>> getall(){
		return new ResponseEntity<>(service.grtAllProduct(),HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

=======
	public ResponseEntity<?> getall(){
		return new ResponseEntity<>(service.grtAllProduct(),HttpStatus.OK);
	}
	
	
>>>>>>> 7cb1dd13cbd476e70f170a512303a20c6e93e0f0
}
