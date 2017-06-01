package classes;

import java.sql.*;
import static classes.InitParam.*;

public class ExecuteDML {

    public int insertData(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pwd);
                // 创建 Statement 对象
                Statement stmt = conn.createStatement()) {
            // 执行 DML 语句，返回受影响的记录数
            return stmt.executeUpdate(sql);
        } 

    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        String sql = "INSERT INTO jdbc_test (jdbc_name, jdbc_desc)"
            + "SELECT s.student_name, t.teacher_name "
            + "FROM student_table s, teacher_table t " 
            + "WHERE s.java_teacher = t.teacher_id;";
        ExecuteDML ed = new ExecuteDML();
        int result = ed.insertData(sql);
        System.out.println("--系统中共有" + result + "条记录受影响--");
    }
} 
