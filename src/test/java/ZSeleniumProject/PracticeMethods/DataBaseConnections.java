package PracticeMethods;

import java.sql.*;

public class DataBaseConnections {

    public static void main(String[] args) throws SQLException {

            // Database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database name
            String user = "your_username";
            String password = "your_password";

            // Establish connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

                // Example Query: Retrieving data
                String query = "SELECT * FROM EMPLOYEE"; // Replace with your table name
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("Column1: " + rs.getString("column1")); // Replace with actual column names
                        System.out.println("Column2: " + rs.getInt("column2"));
                    }
        }
    }

