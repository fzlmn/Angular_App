package com.aymane.backendapp.repositories;

import com.aymane.backendapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
