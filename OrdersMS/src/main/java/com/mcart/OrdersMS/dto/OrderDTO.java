package com.mcart.OrdersMS.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

public class OrderDTO {

	@NotNull(message = "OrderID can not be null")
	private int orderID;
	@NotNull(message = "CartID can not be null")
	private int cartID;
	private Date dateOfOrder;
	private int orderAmount;
	private List<ProductsInOrderDTO> productsInOrder;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public List<ProductsInOrderDTO> getProductsInOrder() {
		return productsInOrder;
	}
	public void setProductsInOrder(List<ProductsInOrderDTO> productsInOrder) {
		this.productsInOrder = productsInOrder;
	}
	
	

}
