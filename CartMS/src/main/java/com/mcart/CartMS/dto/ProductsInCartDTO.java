package com.mcart.CartMS.dto;

public class ProductsInCartDTO {
//	private int cartId;
	private int productId;
	private String productName;
	private int quantity;
	
//	public int getCartId() {
//		return cartId;
//	}
//	public void setCartId(int cartId) {
//		this.cartId = cartId;
//	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
