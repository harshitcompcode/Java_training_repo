package com.graymatter;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/tableset";
        String name = "root";
        String pwd = "password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, name, pwd);
    }

    @Override
    public List<Person> getAllPersonInfo() throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM person";
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        List<Person> persons = new ArrayList<>();
        while (rs.next()) {
            Person person = new Person(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("mobile"), rs.getString("email"));
            persons.add(person);
        }

        rs.close();
        stmt.close();
        con.close();

        return persons;
    }

    @Override
    public Person getPersonById(int id) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM person WHERE id = ?";
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        Person person = null;
        if (rs.next()) {
            person = new Person(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("mobile"), rs.getString("email"));
        }

        rs.close();
        pstmt.close();
        con.close();

        return person;
    }

    @Override
    public Person addPerson(Person person) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO person (name, age, mobile, email) VALUES (?, ?, ?, ?)";
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, person.getName());
        pstmt.setInt(2, person.getAge());
        pstmt.setString(3, person.getMobile());
        pstmt.setString(4, person.getEmail());
        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            person.setId(rs.getInt(1));
        }

        rs.close();
        pstmt.close();
        con.close();

        return person;
    }

    @Override
    public Person updatePerson(Person person, int id) throws SQLException, ClassNotFoundException {
        String query = "UPDATE person SET name = ?, age = ?, mobile = ?, email = ? WHERE id = ?";
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, person.getName());
        pstmt.setInt(2, person.getAge());
        pstmt.setString(3, person.getMobile());
        pstmt.setString(4, person.getEmail());
        pstmt.setInt(5, id);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();

        return getPersonById(id);
    }

    @Override
    public Person deletePerson(int id) throws SQLException, ClassNotFoundException {
        Person person = getPersonById(id);
        if (person != null) {
            String query = "DELETE FROM person WHERE id = ?";
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            pstmt.close();
            con.close();
        }

        return person;
    }
}
