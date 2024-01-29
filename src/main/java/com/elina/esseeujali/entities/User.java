package com.elina.esseeujali.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private Integer points;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book books;
	
	@ManyToOne
	@JoinColumn(name = "trophy_id")
	private Trophy trophies ;
	
	public User() {

	}

	public User(Long id, String name, String email, Integer points, Book books, Trophy trophies) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.points = points;
		this.books = books;
		this.trophies = trophies;
	}


	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points =+ points;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}

	public Trophy getTrophies() {
		return trophies;
	}

	public void setTrophies(Trophy trophies) {
		this.trophies = trophies;
	}


}
