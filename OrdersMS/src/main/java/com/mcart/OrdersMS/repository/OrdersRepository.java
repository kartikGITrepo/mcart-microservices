package com.mcart.OrdersMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcart.OrdersMS.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
}
