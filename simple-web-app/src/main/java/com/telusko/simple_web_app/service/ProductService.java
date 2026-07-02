package com.telusko.simple_web_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.simple_web_app.model.Product;
import com.telusko.simple_web_app.repository.ProductRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    // Dummy data
    // List<Product> products = new ArrayList<>(Arrays.asList(
    // new Product(1, "Product 1", 10.0),
    // new Product(2, "Product 2", 20.0),
    // new Product(3, "Product 3", 30.0),
    // new Product(4, "Product 4", 40.0),
    // new Product(5, "Product 5", 50.0)));

    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    public Product getProduct(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(int id, Product product) {
        if (productRepo.existsById(id)) {
            productRepo.save(product);
        }
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
