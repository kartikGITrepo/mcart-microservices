package com.mcart.OrdersMS.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders{
	@Id
	private int orderId;
	private int cartId;
	private Date dateOfOrder ;
	private int orderAmount;
//	private OrderDetails productsInOrder;
	private String productsInOrder;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	public String getProductsInOrder() {
		return productsInOrder;
	}
	public void setProductsInOrder(String productsInOrder) {
		this.productsInOrder = productsInOrder;
	}
}
