package ZSeleniumProject.PracticeMethods;

import java.sql.*;

public class DataBaseConnections {

    public static void main(String[] args) throws SQLException {

            // Database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database name
            String username = "your_username";
            String password = "your_password";

            // Establish con  using Connection interface and DriverManager class
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");

                // create statment instance  using statment interface and create statement
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE"); // user ResultSet interface to executequery and store results

                    while (rs.next()) {
                        System.out.println("Column1: " + rs.getString("column1")); // Replace with actual column names
                        System.out.println("Column2: " + rs.getInt("column2"));
                    }
        }
    }

