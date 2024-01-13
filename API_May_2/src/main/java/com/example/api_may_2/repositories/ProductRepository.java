package com.example.api_may_2.repositories;

import com.example.api_may_2.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}