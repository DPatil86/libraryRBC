package com.rcb.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Library {
	
	@Id
	private int book_id;
	
	@Column(name="book_name")
	private String book_name;

	@Column(name="fare")
	private double fare;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Library(int book_id, String book_name, double fare) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.fare = fare;
	}
	public Library() {
	}
}
