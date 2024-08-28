package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	
	
	
}
