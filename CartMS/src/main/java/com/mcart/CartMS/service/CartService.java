package com.mcart.CartMS.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcart.CartMS.repository.CartRepository;
import com.mcart.CartMS.dto.CartDTO;
import com.mcart.CartMS.dto.ProductsInCartDTO;
import com.mcart.CartMS.entity.Cart;
import com.mcart.CartMS.entity.CartDetails;
import com.mcart.CartMS.exception.McartException;

@Service
public class CartService{

	@Autowired
	private CartRepository cartrepo;
	
	public String updateCart(@Valid CartDTO cartDTO) throws McartException{
		Optional<Cart> cart = cartrepo.findByUserNameAndStatusOfCart(cartDTO.getUserName(),"Open");
		if (cart.isPresent()) {
			Cart userCart = cart.get();
			userCart.setDateOfModification(new Date());
//			List <CartDetails> cartDetails = userCart.getProductsInCart();
			String cartDetails = userCart.getProductsInCart();
			for(ProductsInCartDTO products : cartDTO.getProductsInCart()) {
				CartDetails newCartDetails = new CartDetails();
				newCartDetails.setCartId(userCart.getCartId());
				newCartDetails.setProductId(products.getProductId());
				newCartDetails.setProductName(products.getProductName());
				newCartDetails.setQuantity(products.getQuantity());
//				cartDetails.add(newCartDetails);
				cartDetails+=newCartDetails;
			}
			userCart.setProductsInCart(cartDetails);
			cartrepo.saveAndFlush(userCart);
			return "CartID: "+userCart.getCartId()+" updated";
		}
		else {
			return "User's cart is not available";
		}
	}
	public String addToCart(@Valid CartDTO cartDTO) throws McartException{
		Optional<Cart> userCart = cartrepo.findByUserNameAndStatusOfCart(cartDTO.getUserName(),"Open");
		if (userCart.isPresent()) {
			return "User's cart is already available, append to the same cart";
		}
		else {
			Cart cart = new Cart();
			cart.setUserName(cartDTO.getUserName());
			cart.setDateOfCreation(new Date());
			cart.setDateOfModification(new Date());
			cart.setStatusOfCart("Open");
//			List <CartDetails> cartDetails = cartEntity.getProductsInCart();
			String cartDetails = cart.getProductsInCart();
			for(ProductsInCartDTO products : cartDTO.getProductsInCart()) {
				CartDetails newCartDetails = new CartDetails();
				newCartDetails.setCartId(101);
				newCartDetails.setProductId(products.getProductId());
				newCartDetails.setProductName(products.getProductName());
				newCartDetails.setQuantity(products.getQuantity());
//				cartDetails.add(newCartDetails);
				cartDetails+=newCartDetails;
			}
			cart.setProductsInCart(cartDetails);
			cartrepo.saveAndFlush(cart);
			return "New items got inserted into the cart with the ID : "+cart.getCartId();
		}
	}
	public List<Cart> getAllCarts() throws McartException{
		return cartrepo.findAll();
	}
	public List<Cart> fetchCartByUser(String username) throws McartException{
		return cartrepo.findByUserName(username);
	}
	public Boolean closeCart(String username) throws McartException{
		Optional<Cart> cart = cartrepo.findByUserNameAndStatusOfCart(username,"Open");
		if (cart.isPresent()) {
			Cart userCart = cart.get();
			userCart.setStatusOfCart("Closed");
			cartrepo.saveAndFlush(userCart);
			return Boolean.TRUE;
		}
		else {
			throw new McartException("Cart does not exist.");
	}
	}
}
