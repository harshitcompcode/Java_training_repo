package com.graymatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Item;
import com.graymatter.service.ItemService;

@RestController
@RequestMapping("/api/v1")

public class ItemController {

	@Autowired
	ItemService service;
	
	@GetMapping("Item")
	public ResponseEntity<?>gettAllItem(){
		return service.getAllItem();
	}
	
	@PostMapping("Item")
	public Item addItem(@RequestBody Item i) {
		return service.addItem(i);
	}
	
	
	
}
