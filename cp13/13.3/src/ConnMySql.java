package classes;

import java.sql.*;

public class ConnMySql {
    public static void main (String [] args) throws Exception 
    {
        Class.forName("com.mysql.jdbc.Driver");
        try (
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/select_test",
                    "root", "464099ya%");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT s.*, teacher_name"
                    + " FROM student_table s, teacher_table t"
                    + " WHERE t.teacher_id = s.java_teacher")
            ) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t"
                        + rs.getString(2) + "\t"
                        + rs.getInt(3) + "\t"
                        + rs.getString(4));
            }
        } 
    }
} 
