package com.cesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesar.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
