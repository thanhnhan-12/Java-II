package Day5.JDBC;

import java.sql.*;

public class LoadDriver {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "nhan");
            System.out.println("Connect Successfully!");
            // 3. Executed Query
            Statement st = conn .createStatement();

            // 4. Handle Result
            ResultSet rs = st.executeQuery("Select * from students");
            ResultSetMetaData rsmd = rs.getMetaData();
            
            // 5. Print all columns of name
            int col = rsmd.getColumnCount();
            for(int i = 1; i <= col; i++ ) {
                System.out.print(rsmd.getColumnLabel(i) + "\t\t" );
            }

            System.out.println();

            while(rs.next()) {
                for(int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t\t" );
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Error Connect Database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());

        }

    }
}
