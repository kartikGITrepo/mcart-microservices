package com.mcart.ProductsMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mcart.ProductsMS.dto.ProductsDTO;

@Entity
@Table(name = "products")
public class Products{
	@Id
	private int productId;
	private String productName;
	private String productCode;
	private String description;
	private String imageUrl;
	private int price;
	private double rating;
	private String manufacturer;
	private String osType;

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
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}	
	
	public ProductsDTO EntityToDto (Products entity) {
		ProductsDTO product = new ProductsDTO();
		product.setProductId(entity.getProductId());
		product.setProductName(entity.getProductName());
		product.setProductCode(entity.getProductCode());
		product.setDescription(entity.getDescription());
		product.setImageUrl(entity.getImageUrl());
		product.setPrice(entity.getPrice());
		product.setRating(entity.getRating());
		product.setManufacturer(entity.getManufacturer());
		product.setOsType(entity.getOsType());
		return product;
	}
}
