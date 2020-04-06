package com.mcart.CartMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcart.CartMS.entity.CartDetails;

@Repository
public interface CartDetailsRepository extends JpaRepository<CartDetails, Integer> {

}
