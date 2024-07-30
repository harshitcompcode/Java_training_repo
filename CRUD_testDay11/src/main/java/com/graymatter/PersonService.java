package com.graymatter;

import java.sql.SQLException;
import java.util.List;

public interface PersonService {
    List<Person> getAllPersonInfo() throws SQLException, ClassNotFoundException;
    Person getPersonById(int id) throws SQLException, ClassNotFoundException;
    Person addPerson(Person person) throws SQLException, ClassNotFoundException;
    Person updatePerson(Person person, int id) throws SQLException, ClassNotFoundException;
    Person deletePerson(int id) throws SQLException, ClassNotFoundException;
}
