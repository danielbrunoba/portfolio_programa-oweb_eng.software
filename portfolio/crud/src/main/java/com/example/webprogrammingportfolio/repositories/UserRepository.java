package com.example.webprogrammingportfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webprogrammingportfolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
