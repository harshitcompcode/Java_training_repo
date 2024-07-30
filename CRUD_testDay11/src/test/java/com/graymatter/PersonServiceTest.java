package com.graymatter;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

public class PersonServiceTest {

    private PersonService personService;

    @Before
    public void setUp() {
        personService = new PersonServiceImpl();
    }

    @Test
    public void testGetAllPersonInfo() throws SQLException, ClassNotFoundException {
        List<Person> persons = personService.getAllPersonInfo();
        assertNotNull(persons);
        assertFalse(persons.isEmpty());
    }

    @Test
    public void testGetPersonById() throws SQLException, ClassNotFoundException {
        Person person = personService.getPersonById(1);
        assertNotNull(person);
    }

    @Test
    public void testAddPerson() throws SQLException, ClassNotFoundException {
        Person person = new Person(0, "John Doe", 30, "1234567890", "john@example.com");
        Person addedPerson = personService.addPerson(person);
        assertNotNull(addedPerson);
        assertEquals("John Doe", addedPerson.getName());
    }

    @Test
    public void testUpdatePerson() throws SQLException, ClassNotFoundException {
        Person person = new Person(1, "Jane Doe", 25, "0987654321", "jane@example.com");
        Person updatedPerson = personService.updatePerson(person, 1);
        assertNotNull(updatedPerson);
        assertEquals("Jane Doe", updatedPerson.getName());
    }

    @Test
    public void testDeletePerson() throws SQLException, ClassNotFoundException {
        Person deletedPerson = personService.deletePerson(1);
        assertNotNull(deletedPerson);
    }
}
