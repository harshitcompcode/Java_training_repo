package com.graymatter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Author;
import com.graymatter.entities.Book;
import com.graymatter.repository.AuthorRepository;

import jakarta.transaction.Transactional;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository repository;
	
	
	public void saveAuthorWithBooks() {
		Author author = new Author("RR Martin");
		Book book1 = new Book("DSA");
		Book book2 = new Book("Understanding");
		
		author.addBook(book1);
		author.addBook(book2);
		repository.save(author);
	}
	
	@Transactional
	public void removeAuthor(int id) {
		repository.deleteById(id);
	}
	
	
	
	
	
	
	
	
}


