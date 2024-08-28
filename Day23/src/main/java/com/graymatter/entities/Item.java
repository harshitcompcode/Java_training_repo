package com.graymatter.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Item {
	
	
	@Id
	private int itemId;
	
	private String itemName;
	
	@ManyToMany(mappedBy = "itemList")
	@JsonIgnore
	private List<Order>orderList;
	
	
	

}
