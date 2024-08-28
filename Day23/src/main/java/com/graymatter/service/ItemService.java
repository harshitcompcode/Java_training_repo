package com.graymatter.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.graymatter.dao.ItemDao;
import com.graymatter.entities.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao dao;
	
	
	public ResponseEntity<?>getAllItem(){
		
		return dao.getAllItem();		
	}
	
	public Item addItem(Item i) {
		return dao.addItem(i);
	}
	
	
}
