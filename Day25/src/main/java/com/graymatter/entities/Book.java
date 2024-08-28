package com.graymatter.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="id")
	private Author author;
	private String title;
	
	
	
	public Book(String title) {
		super();
		this.title = title;
		
		
	}
	
	
	
	
}
