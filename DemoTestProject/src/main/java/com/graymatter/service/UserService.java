package com.graymatter.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.User;
import com.graymatter.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	
    public User createUser(User user) {
        return repository.save(user);
    }

 
    public User getUserById(int id) {
        return repository.findById(id)
                .orElseThrow(()->new NoSuchElementException());
    }

    
    public User updateUser(int id, User userDetails) {
        User user = getUserById(id);
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return repository.save(user);
    }
   
    public void deleteUser(int id) {
        User user = getUserById(id);
        repository.delete(user);
    }

    
    public List<User> getAllUsers() {
        return repository.findAll();
    }
			

}
