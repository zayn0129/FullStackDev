package com.example.activate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")

public class ProductCatalog {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="product_id")
	private Long productId;
	@Column (name="product_name")
	private String productName;
	@Column (name="product_price")
	private int productPrice;
	@Column (name="product_category")
	private String productCategory;
	
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	}