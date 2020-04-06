package com.mcart.OrdersMS.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

public class CartDTO {
	
	@NotNull(message = "CartID can not be null")
	private int cartID;
	@NotNull(message = "UserName can't be null")
	private String userName;
	private Date dateOfCreation;
	private Date dateOfModification;
	private String statusOfCart;
	private List<ProductsInCartDTO> productsInCart;
	
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public Date getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(Date dateOfModification) {
		this.dateOfModification = dateOfModification;
	}
	public String getStatusOfCart() {
		return statusOfCart;
	}
	public void setStatusOfCart(String statusOfCart) {
		this.statusOfCart = statusOfCart;
	}
	public List<ProductsInCartDTO> getProductsInCart() {
		return productsInCart;
	}
	public void setProductsInCart(List<ProductsInCartDTO> productsInCart) {
		this.productsInCart = productsInCart;
	}
	

}
