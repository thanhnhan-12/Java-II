package Day5.JDBC;

import java.sql.*;

public class LoadDriver {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://NGUYENTHANHNHAN//SQLEXPRESS;databaseName=StudentManagement";
        String username = "sa";
        String password = "nhan";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connect Successfully!");
        
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error Connect Database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}
