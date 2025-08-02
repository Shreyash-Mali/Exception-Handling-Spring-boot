package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByName(String name);
}
