package com.API_Crud_operation.demo.repository;

import com.API_Crud_operation.demo.entity.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
