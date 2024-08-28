package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
