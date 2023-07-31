package com.Taskproject.product.repository;

import com.Taskproject.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRepository extends JpaRepository<Product,Long> {
}
