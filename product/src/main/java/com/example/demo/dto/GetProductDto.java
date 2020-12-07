package com.example.demo.dto;

import org.springframework.web.multipart.MultipartFile;

public class GetProductDto {

private int productId;
	
	private String productName;	
	private byte[] imageContent;
	private String productColor;
	private long productPrice;
	private int categoryId;
	private String categoryName;

	
	public GetProductDto() {
		// TODO Auto-generated constructor stub
	}


	public GetProductDto(int productId, String productName, byte[] imageContent, String productColor, long productPrice,
			int categoryId, String categoryName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.imageContent = imageContent;
		this.productColor = productColor;
		this.productPrice = productPrice;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}


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


	public byte[] getImageContent() {
		return imageContent;
	}


	public void setImageContent(byte[] imageContent) {
		this.imageContent = imageContent;
	}


	public String getProductColor() {
		return productColor;
	}


	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}


	public long getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
