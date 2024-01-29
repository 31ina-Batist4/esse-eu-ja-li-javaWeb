package com.elina.esseeujali.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elina.esseeujali.entities.Book;
import com.elina.esseeujali.repositories.BookRepository;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@GetMapping
	public List<Book> findAll() {
		List<Book> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Book findById(@PathVariable Long id) {
	 Book result = repository.findById(id).get();
	 return result;
	}
	
	@PostMapping
	public Book save(@RequestBody Book book) {
	 Book request = repository.save(book);
	 return request;
	}

}
