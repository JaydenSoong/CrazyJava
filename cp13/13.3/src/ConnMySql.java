package classes;

import java.sql.*;

public class ConnMySql {
    public static void main (String [] args) throws Exception 
    {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        try (
                /*
                 *2.使用 DriverManager 获取数据库连接
                 *返回的 Connection 就代表了 Java 程序和数据库的连接
                 */
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/select_test",
                    "root", "464099ya%");
                //3.使用 Connection 来创建一个 Statement 对象
                Statement stmt = conn.createStatement();
                //4.执行 SQL 语句
                ResultSet rs = stmt.executeQuery("SELECT s.*, teacher_name"
                    + " FROM student_table s, teacher_table t"
                    + " WHERE t.teacher_id = s.java_teacher")
            ) {
            /*
             *ResultSet 有一系列的 getXxx(列索引|列名)方法，用于获取记录指针
             *指向行、特定列的值，不断使用 nexg() 将记录指针下移一行
             */
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t"
                        + rs.getString(2) + "\t"
                        + rs.getInt(3) + "\t"
                        + rs.getString(4));
            }
        } 
    }
} 
