package com.cesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cesar.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
