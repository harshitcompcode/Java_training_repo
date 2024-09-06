package com.graymatter.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.graymatter.entities.User;
import com.graymatter.service.UserService;

@WebMvcTest(controllers = UserController.class)
public class UserControllerTest {
	   
		@Autowired                          
	   private MockMvc mockMvc; 
	                                               
	   @MockBean                          
	   private UserService userService;
	                                             
	   private List<User> userList;      
	                                          
	   @BeforeEach                          
	   void setUp() {                              
	      this.userList = new ArrayList<User>();                                    
	      this.userList.add(new User(1,"swapna","swapna@gmail.com"));                               
	      this.userList.add(new User(2,"Amit","amit@gmail.com"));                 
	      this.userList.add(new User(3,"Vikky","vikky@gmail.com"));                                                      

	   }
	   
	   
	   @Test
	   public void testGetAllUsers()throws Exception {
		   Mockito.when(userService.getAllUsers()).thenReturn(userList);
		   this.mockMvc.perform(get("/users"))
		   			.andExpect(status().isOk())
		   			.andExpect(jsonPath("$.size()",is(userList.size())));
		   
	   }
	   
	   
	   @Test
	    public void testGetUserById() throws Exception {
	        User user = new User(1, "Swathi", "swathi@gmail.com");
	        Mockito.when(userService.getUserById(1)).thenReturn(user);

	        mockMvc.perform(get("/users/1")
	                .contentType(MediaType.APPLICATION_JSON))
	                .andExpect(status().isOk())
	                .andExpect(jsonPath("$.id").value(1))
	                .andExpect(jsonPath("$.name").value("Swathi"))
	                .andExpect(jsonPath("$.email").value("swathi@gmail.com"));
	    }
	   
	   @Test
	    public void testCreateUser() throws Exception {
	        User user = new User(1, "Preeti", "preeti@gmail.com");
	        Mockito.when(userService.createUser(any(User.class))).thenReturn(user);

	        mockMvc.perform(post("/users")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content("{\"name\": \"Preethi\", \"email\": \"preeti@gmail.com\"}"))
	                .andExpect(status().isCreated())
	                .andExpect(jsonPath("$.id").value(1))
	                .andExpect(jsonPath("$.name").value("Preeti"))
	                .andExpect(jsonPath("$.email").value("preeti@gmail.com"));
	    }

	    @Test
	    public void testUpdateUser() throws Exception {
	        User user = new User(1, "Mona", "Mona@gmail.com");
	        Mockito.when(userService.updateUser(eq(1), any(User.class))).thenReturn(user);

	        mockMvc.perform(put("/users/1")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content("{\"name\": \"Mona\", \"email\": \"Mona@gmail.com\"}"))
	                .andExpect(status().isOk())
	                .andExpect(jsonPath("$.id").value(1L))
	                .andExpect(jsonPath("$.name").value("Mona"))
	                .andExpect(jsonPath("$.email").value("Mona@gmail.com"));
	    }

	    @Test
	    public void testDeleteUser() throws Exception {
	        Mockito.doNothing().when(userService).deleteUser(1);

	        mockMvc.perform(delete("/users/1")
	                .contentType(MediaType.APPLICATION_JSON))
	                .andExpect(status().isNoContent());
	    }	   
}
