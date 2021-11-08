package com.infogain.Assignment.model;

/**
 * @author VIPIN
 *
 */
public class Product {

	private Integer productId;
	private String productName;
	private Float productPrice;
	private Integer productQty;

	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}


	public Integer getProductQty() {
		return productQty;
	}


	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + "]";
	}

}
