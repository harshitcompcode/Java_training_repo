package com.graymatter;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCRUD {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/tableset";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            // Establishing the connection
            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
                System.out.println("Connection established");

                // Insert new dependents
                insertDependent(con, 10, "John", "Doe", "Spouse", 112);

                // Update an existing dependent
                updateDependent(con, 20, "John", "Doe", "Partner");

                // Delete a dependent
                deleteDependent(con, 10);

                // Select all dependents
                selectDependents(con);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDependent(Connection con, int dependentId, String firstName, String lastName, String relationship, int employeeId) {
        String query = "INSERT INTO dependents(dependent_id, first_name, last_name, relationship, employee_id) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, dependentId);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, relationship);
            ps.setInt(5, employeeId);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDependent(Connection con, int dependentId, String firstName, String lastName, String relationship) {
        String query = "UPDATE dependents SET first_name = ?, last_name = ?, relationship = ? WHERE dependent_id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, relationship);
            ps.setInt(4, dependentId);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDependent(Connection con, int dependentId) {
        String query = "DELETE FROM dependents WHERE dependent_id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, dependentId);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectDependents(Connection con) {
        String query = "SELECT * FROM dependents";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("dependent_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String relationship = rs.getString("relationship");
                int employeeId = rs.getInt("employee_id");
                System.out.println(id + " | " + firstName + " | " + lastName + " | " + relationship + " | " + employeeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
