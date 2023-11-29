package com.customers.app.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prod_id")
	private int prodId;



	@Column(name = "book_title")
	private String bookTitle;

	@Column(name = "book_price")
	private double bookPrice;

	@Column(name = "book_quantity")
	private int bookQuantity;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	
}
