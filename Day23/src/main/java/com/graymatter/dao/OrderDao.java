package com.graymatter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Employee;
import com.graymatter.entities.Order;
import com.graymatter.repository.EmployeeRepository;
import com.graymatter.repository.OrderRepository;

@Repository
public class OrderDao {

	
	
	@Autowired
	OrderRepository repository;
	
	public ResponseEntity<?> getAllOrder(){
		List<Order> pList = repository.findAll();
    	Map<String,Object> map = new HashMap<String,Object>();
    	
    	if(!pList.isEmpty()) {
    		map.put("status",10);
    		map.put("data",pList);
    		return new ResponseEntity<>(map,HttpStatus.OK);
    	}
    	else {
    		map.put("status",20);
    		map.put("data","List is empty");
    		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
    	}
	}
	
	public Order addOrder(Order e) {
		return repository.save(e);
	}
}
