package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "product")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productId")
@JsonIgnoreProperties(value = { "category" })
public class Product implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private String productName;	
	@Lob
	private byte[] imageContent;

	private String productColor;
	private long productPrice;
	@ManyToOne
	private Category category;

	
	public Product(int productId, String productName, byte[] imageContent, String productColor, long productPrice,
			Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.imageContent = imageContent;
		this.productColor = productColor;
		this.productPrice = productPrice;
		this.category = category;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
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


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
}
