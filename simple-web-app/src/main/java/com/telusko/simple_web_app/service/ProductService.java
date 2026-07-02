package com.telusko.simple_web_app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.simple_web_app.model.Product;

@Service
public class ProductService {

    // Dummy data
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Product 1", 10.0),
            new Product(2, "Product 2", 20.0),
            new Product(3, "Product 3", 30.0),
            new Product(4, "Product 4", 40.0),
            new Product(5, "Product 5", 50.0)));

    public List<Product> getAllProducts() {
        // Logic to retrieve all products from the database or any data source
        return products;
    }

    public Product getProduct(int id) {
        // Logic to retrieve a product by its ID from the database or any data source
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                return;
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
