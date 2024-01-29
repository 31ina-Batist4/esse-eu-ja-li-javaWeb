package com.elina.esseeujali.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elina.esseeujali.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
