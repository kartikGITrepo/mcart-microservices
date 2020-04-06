package com.mcart.CartMS.entity;

import java.util.Date;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart{
	@Id
	private int cartId;
	private String userName;
	private Date dateOfCreation;
	private Date dateOfModification;
	private String statusOfCart;
//	private List<CartDetails> productsInCart;
	private String productsInCart;

	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	public String getProductsInCart() {
		return productsInCart;
	}
	public void setProductsInCart(String productsInCart) {
		this.productsInCart = productsInCart;
	}

}
