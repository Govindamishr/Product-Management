package com.Taskproject.product.controller;

import com.Taskproject.product.model.Product;
import com.Taskproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController


public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/saveProduct")

    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/")

    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/{id}")

    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @GetMapping("/deleteProduct/{id}")

    public String deletedProduct(@PathVariable Long id){
        return productService.deletedProduct(id);
    }

    @PostMapping("/editProduct/{id}")

    public String editProduct(@RequestBody Product product,@PathVariable Long id){
        return productService.editProduct(product,id);
    }

}
