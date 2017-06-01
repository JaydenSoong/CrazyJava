package classes;

import java.sql.*;
import static classes.InitParam.*;

public class ExecuteSQL {
    public void executeSql(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 建立连接
                Connection conn = DriverManager.getConnection(url, user, pwd);
                // 创建语句
                Statement stmt = conn.createStatement()) {
            // 执行SQL语句，返回boolean值表示是否包含ResultSet
           boolean hasResult = stmt.execute(sql);
           // 如果执行后有结果集
           if (hasResult) {
               try (ResultSet rs = stmt.getResultSet()) {
                   // ResultSetMetaData 是用于分析结果集的元数据接口
                   ResultSetMetaData rsmd = rs.getMetaData();
                   int columnCount = rsmd.getColumnCount();
                   // 迭代输出 ResultSet对象
                   while (rs.next()) {
                       // 依次输出每列的值
                       for (int i=0; i<columnCount; i++) {
                           System.out.print(rs.getString(i + 1) + "\t");
                       } 
                       System.out.print("\n");
                   } 
               } 
           } else {
               System.out.println("该SQL语句影响的记录有" + stmt.getUpdateCount() + "条");
           }
        } 
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        ExecuteSQL es = new ExecuteSQL();
        System.out.println("--------执行删除表的DDL语句--------");
        es.executeSql("DROP TABLE IF EXISTS my_test");
        System.out.println("--------执行建表的DDL语句--------");
        es.executeSql("CREATE TABLE my_test("
                + "test_id INT AUTO_INCREMENT PRIMARY KEY,"
                + "test_name VARCHAR(20));");
        System.out.println("--------执行插入数据的DML语句--------");
        es.executeSql("INSERT INTO my_test(test_name) "
                + "SELECT student_name from student_table;");
        System.out.println("--------执行查询数据的语句--------");
        es.executeSql("SELECT * FROM my_test");
    }
} 
