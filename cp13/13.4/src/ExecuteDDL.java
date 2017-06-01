package classes;

import java.sql.*;

public class ExecuteDDL {

    public void createTable(String sql) throws Exception {
        // 加载驱动
        Class.forName(InitParam.driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(InitParam.url, InitParam.user, InitParam.pwd);
                // 使用 Connection 对象来创建一个 Statement 对象
                Statement stmt = conn.createStatement()) {
            // 执行 DDL 语句
            stmt.executeUpdate(sql);
        } 
    }

    public static void main (String [] args) throws Exception {
        ExecuteDDL ed = new ExecuteDDL();
        InitParam.initParam("mysql.properties");
        ed.createTable("CREATE TABLE IF NOT EXISTS jdbc_test"
                + " (jdbc_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "jdbc_name VARCHAR(30), "
                + "jdbc_desc TEXT);");
        System.out.println("--------建表成功--------");
    }
} 
