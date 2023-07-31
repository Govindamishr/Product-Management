package com.Taskproject.product.service;

import com.Taskproject.product.model.Product;
import com.Taskproject.product.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IRepository iRepository;


    public List<Product> getAllProduct() {
        return iRepository.findAll();
    }

    public String addProduct(Product product) {

          iRepository.save(product);
         return "Added Successfully";

    }

    public Optional<Product> getProductById(Long id) {
        return iRepository.findById(id);
    }

    public String deletedProduct(Long id) {
        iRepository.deleteById(id);
        return "Deleted SuccessFully";
    }

    public String editProduct(Product product, Long id) {
        Optional<Product> listProduct = iRepository.findById(id);
        product.setId(id);
        if(listProduct.isEmpty() ){
            return "product is Not Found";
        }else{
            iRepository.save(product);
        }
        return "product Is Updated";
    }
}
