package com.mcart.OrdersMS.dto;

import javax.validation.constraints.NotNull;

public class UserOrderDTO {

	@NotNull(message = "Username can not be null")
	private String userName;
	@NotNull(message = "Order amount can not be null")
	private int orderAmount;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

}
