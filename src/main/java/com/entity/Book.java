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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    
    @Column(name = "Title")
    private String bookTitle;
    
    @Column(name = "Author")
    private String author;
    
    @Column(name = "Price")
    private double price;
    
    // Getters and Setters
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
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
    
    public Book(int bookId, String bookTitle, String author, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }
    public Book() {
    }
    
    public Book(String bookTitle, String author, double price) {
    	 this.bookTitle = bookTitle;
         this.author = author;
         this.price = price;
	}
	@Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + "]";
    }
}
