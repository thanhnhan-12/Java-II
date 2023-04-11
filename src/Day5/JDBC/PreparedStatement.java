package Day5.JDBC;

import java.sql.*;

public class PreparedStatement {

    public static void main(String[] args) {
        String[] id = { "5", "6" };
        String[] names = { "Tuchel", "Nagelsmann" };
        String[] java = { "6", "7" };
        String[] notes = { "T", "F" };
        // java.sql.PreparedStatement ps;

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root",
                    "nhan");
            System.out.println("Connect Successfully!");

            // 3. Executed Query
            java.sql.PreparedStatement ps = conn
                    .prepareStatement("Insert into students (id, name, java, note) values (?, ?, ?, ?) ");
            conn.setAutoCommit(false);
            for (int i = 0; i < notes.length; i++) {
                ps.setString(1, id[i]);
                ps.setString(2, names[i]);
                ps.setString(3, java[i]);
                ps.setString(4, notes[i]);

                ps.executeUpdate();
            }
            conn.commit();
            ResultSet rs = ps.executeQuery("Select * from students");
            ResultSetMetaData rsmd = rs.getMetaData();

            int col = rsmd.getColumnCount();

            for (int i = 1; i <= col; i++) {
                System.out.print(rsmd.getColumnLabel(i) + "\t");
            }

            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t\t");
                }
                System.out.println();
            }

            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error Connect Database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());

        }

    }

}
