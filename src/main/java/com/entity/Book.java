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

}
