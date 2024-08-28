package com.graymatter.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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


@Table(name = "OrderTable")
public class Order {
	
	
	@Id
	private int orderId;
	private Date orderDate;
	
	
	@ManyToMany
    @JoinTable(
        name = "order_item", // Name of the join table
        joinColumns = @JoinColumn(name = "order_id"), // Column in join table for Order
        inverseJoinColumns = @JoinColumn(name = "item_id") // Column in join table for Item
    )
	private List<Item>itemList;
	

}
