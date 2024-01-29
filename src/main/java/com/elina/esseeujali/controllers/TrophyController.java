package com.elina.esseeujali.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elina.esseeujali.entities.Trophy;
import com.elina.esseeujali.repositories.TrophyRepository;

@RestController
@RequestMapping(value = "/trophies")
public class TrophyController {

	@Autowired
	private TrophyRepository repository;
	
	@GetMapping
	public List<Trophy> findAll() {
		List<Trophy> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Trophy findById(@PathVariable Long id) {
		Trophy result = repository.findById(id).get();
		return result;
	}
}

