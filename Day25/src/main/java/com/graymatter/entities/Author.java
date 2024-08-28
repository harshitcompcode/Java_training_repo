package com.graymatter.entities;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> bookList = new ArrayList<>(); // Initialize the list

    public Author(String name) {
        this.name = name;
        this.bookList = new ArrayList<>(); // Initialize the list in constructor
    }

    public Book addBook(Book book) {
        bookList.add(book);
        book.setAuthor(this);
        return book;
    }

    public void removeBook(Book book) {
        bookList.remove(book);
        book.setAuthor(null);
    }
}