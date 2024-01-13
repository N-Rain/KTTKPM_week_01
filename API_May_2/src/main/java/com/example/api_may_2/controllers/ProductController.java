package com.example.api_may_2.controllers;

import com.example.api_may_2.models.Product;
import com.example.api_may_2.models.User;
import com.example.api_may_2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("products")
    List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    Product getUserById(@PathVariable long id){
        User user = restTemplate.getForObject("https://65096472f6553137159b5888.mockapi.io/users/"+id, User.class);
        Product product = productRepository.findById(id).get();
        product.setUser(user);
        return product;

    }
}
