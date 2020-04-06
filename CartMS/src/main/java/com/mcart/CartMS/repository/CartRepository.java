package com.mcart.CartMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcart.CartMS.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	List<Cart> findByUserName(String username);

	Optional<Cart> findByUserNameAndStatusOfCart(String userName, String string);
	
}
