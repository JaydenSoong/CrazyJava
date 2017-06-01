package classes;

import java.sql.*;
import static classes.InitParam.*; 

public class PreparedStatementTest {
    public void insertUseStatement() throws Exception {
        long start = System.currentTimeMillis();
        try (
                //建立连接
                Connection conn = DriverManager.getConnection(url, user, pwd);
                //创建语句
                Statement stmt = conn.createStatement()) {
             for (int i = 0; i < 100 ; i++) {
                 stmt.executeUpdate("INSERT INTO student_table VALUES ("
                         + " NULL ,'姓名" + i + "' , 1)");
             }
             System.out.println("使用Statement费时：" + (System.currentTimeMillis() - start));
        }
    } 

    public void insertUsePrepare() throws Exception {
        long start = System.currentTimeMillis();
        try (
                //建立连接
                Connection conn = DriverManager.getConnection(url, user, pwd);
                //创建语句
                //PreparedStatement 对象存储了预编译的SQL语句
                PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO student_table VALUES (NULL, ?, 1)")) {
            for (int i = 0; i < 100; i++) {
                pstmt.setString(1, "姓名" + i);
                pstmt.executeUpdate();
            }
            System.out.println("使用PreparedStatement费时：" + (System.currentTimeMillis() - start));
        } 
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        // 加载驱动
        Class.forName(driver);
        PreparedStatementTest pt = new PreparedStatementTest();
        pt.insertUseStatement();
        pt.insertUsePrepare();
    }
}
