package com.mcart.ProductsMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcart.ProductsMS.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

	List<Products> findByProductCodeStartsWith(String type);
	
	Products findByProductName(String productName);
	
}
