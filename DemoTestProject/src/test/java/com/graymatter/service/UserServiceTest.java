package com.graymatter.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.graymatter.entities.User;
import com.graymatter.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@InjectMocks
    UserService service;

    @Mock
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User(1, "swapna", "swapna@gmail.com");
        User savedUser = new User(1, "swapna", "swapna@gmail.com");

        Mockito.when(userRepository.save(user)).thenReturn(savedUser);

        User result = service.createUser(user);

        assertEquals(1, result.getId());
        assertEquals("swapna", result.getName());
        assertEquals("swapna@gmail.com", result.getEmail());
    }

    @Test
    public void testGetUserById() {
        User user = new User(1, "swapna", "swapna@gmail.com");

        Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));

        User result = service.getUserById(1);

        assertEquals(1L, result.getId());
        assertEquals("swapna", result.getName());
        assertEquals("swapna@gmail.com", result.getEmail());
    }

    public void testGetUserByIdNotFound() {
        Mockito.when(userRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> {
            service.getUserById(1);
        });
    }

    @Test
    public void testUpdateUser() {
        User existingUser = new User(1, "swapna", "swapna@gmail.com.com");
        User updatedDetails = new User(2, "swapnil", "swapnil@gmail.com");
        User updatedUser = new User(2, "swapnil", "swapnil@gmail.com");

        Mockito.when(userRepository.findById(2)).thenReturn(Optional.of(existingUser));
        Mockito.when(userRepository.save(existingUser)).thenReturn(updatedUser);

        User result = service.updateUser(2, updatedDetails);

        assertEquals(2, result.getId());
        assertEquals("swapnil", result.getName());
        assertEquals("swapnil@gmail.com", result.getEmail());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(1, "swapna", "swapna@gmail.com");

        Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));
        Mockito.doNothing().when(userRepository).delete(user);

        service.deleteUser(1);

        Mockito.verify(userRepository, Mockito.times(1)).delete(user);
    }

    @Test
    public void testGetAllUsers() {
        List<User> users = Arrays.asList(
                new User(1, "swapna", "swapna@gmail.com"),
                new User(2, "swapnil", "swapnil@gmail.com")
        );

        Mockito.when(userRepository.findAll()).thenReturn(users);

        List<User> result = service.getAllUsers();

        assertEquals(2, result.size());
        assertEquals("swapna", result.get(0).getName());
        assertEquals("swapnil", result.get(1).getName());
    }
}
