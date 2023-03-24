package com.example.bookcrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_details")
public class Book {
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private String price;
	
	
	public Book() {
		super();
	}


	public Book(String id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
