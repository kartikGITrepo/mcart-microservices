package com.mcart.CartMS.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcart.CartMS.dto.CartDTO;
import com.mcart.CartMS.entity.Cart;
import com.mcart.CartMS.exception.McartException;
import com.mcart.CartMS.service.CartService;

@RestController
@Validated
@RequestMapping("/carts")
public class CartController {
	@Autowired
	private CartService cartServices;
	
	@GetMapping
	public List<Cart> getAllCarts() throws McartException{
		return cartServices.getAllCarts();
	}
	
	@PostMapping
	public String addToCart(@Valid @RequestBody CartDTO cartDTO) throws McartException{
		return cartServices.addToCart(cartDTO);
	}

	@PutMapping
	public String updateCart(@Valid @RequestBody CartDTO cartDTO) throws McartException{
		return cartServices.updateCart(cartDTO);
	}
	
	@GetMapping(params="username")
	public List<Cart> fetchCartByUser(@RequestParam(value = "username") String username ) throws McartException{
			return cartServices.fetchCartByUser(username);		
	}

	@PostMapping(value="/close",params = "username")
	public Boolean closeCart(@RequestParam (value = "username") String username ) throws McartException{
		return cartServices.closeCart(username);
	}
}