package classes;

import static classes.InitParam.*;
import javax.sql.rowset.*;
import java.sql.*;

public class DatabaseMetaDataTest {
    public void info() throws Exception {
        Class.forName(driver);
        try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
            //获致数据库连接
            DatabaseMetaData dbmd = conn.getMetaData();
            //获取MySQL所支持的所有表类型
            ResultSet rs = dbmd.getTableTypes();
            System.out.println("--------MySQL支持的表类型信息--------");
            printResultSet(rs);
            //获致当前数据库的全部数据表
            rs = dbmd.getTables(null, null, "%", new String[]{"TABLES"});
            System.out.println("--------当前数据库里的数据表信息--------");
            printResultSet(rs);
            //获取 student_table 表的主键
            rs = dbmd.getPrimaryKeys(null, null, "student_table");
            System.out.println("--------student_table 表的主键信息--------");
            printResultSet(rs);
            //获取当前数据库的全部存储过程
            rs = dbmd.getProcedures(null, null, "%");
            System.out.println("--------当前数据库的全部存储过程信息--------");
            printResultSet(rs);
            //获取 teacher_table 表和 student_table 表之间的外键约束
            rs = dbmd.getCrossReference(null, null, "teacher_talbe", null, null, "student_table");
            System.out.println("--------teacher_table表和student_table之间的外键约束--------");
            printResultSet(rs);
            //获取student_table表的全部数据列
            rs = dbmd.getColumns(null, null, "student_table", "%");
            System.out.println("--------student_table的全部数据列--------");
            printResultSet(rs);
        }
    }

    public void printResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        //打印ResultSet的所有列表标题
        for (int i = 0, n = rsmd.getColumnCount(); i < n; i++) {
            System.out.print(rsmd.getColumnName(i + 1) + "\t");
        }
        System.out.println("\n" + "--------子分割线--------");
        //打印ResultSet里的全部数据
        while (rs.next()) {
            for (int i = 0, n = rsmd.getColumnCount(); i < n; i++) {
                System.out.print(rs.getString(i + 1) + "\t");     
            }
            System.out.println();
        } 
        rs.close();
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        new DatabaseMetaDataTest().info();
    }
}
