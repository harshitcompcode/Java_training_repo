package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
