package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookTable")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int bookId;
	@Column(name = "Title")
	private String boookTitle;
	@Column
	private String author;
	@Column
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBoookTitle() {
		return boookTitle;
	}
	public void setBoookTitle(String boookTitle) {
		this.boookTitle = boookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookId, String boookTitle, String author, double price) {
		super();
		this.bookId = bookId;
		this.boookTitle = boookTitle;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", boookTitle=" + boookTitle + ", author=" + author + ", price=" + price
				+ "]";
	}
}
