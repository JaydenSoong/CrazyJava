package classes;

import static classes.InitParam.*;
import javax.sql.rowset.*;
import java.sql.*;
    
public class TransactionTest {
    public void insertInTransaction(String[] sqls) throws Exception {
        Class.forName(driver);
        try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
            //关闭自动提交
            conn.setAutoCommit(false);
            try (Statement stmt = conn.createStatement()){
                for (String sql : sqls) {
                    stmt.executeUpdate(sql);
                } 
            }
            //提交事务
            conn.commit();
        }
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        String[] sqls = new String[] {
            "INSERT INTO student_table VALUES (null, 'aaa', 1)",
            "INSERT INTO student_table VALUES (null, 'bbb', 1)",
            "INSERT INTO student_table VALUES (null, 'ccc', 1)",
            //下面这条SQL语句将会违反外键约束，因为teacher_table表中没有ID为5的记录
            "INSERT INTO student_table VALUES (null, 'ddd', 5)"
        };
        new TransactionTest().insertInTransaction(sqls);
    }
}
