package com.elina.esseeujali.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elina.esseeujali.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
