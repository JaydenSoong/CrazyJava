package classes;

import static classes.InitParam.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl;

/**
 * JdbcRowSet演示
 */
public class JdbcRowSetTest {
    public void update(String sql) throws Exception {
        //加载驱动
        Class.forName(driver);
        try (//建立连接
             Connection conn = DriverManager.getConnection(url, user, pwd);
             //创建JdbcRowSetImpl对象
             JdbcRowSet jdbcRs = new JdbcRowSetImpl(conn)) {
            //设置SQL查询
            jdbcRs.setCommand(sql);
            //执行查询
            jdbcRs.execute();
            //滚动到最后
            jdbcRs.afterLast();
            //向前滚动
            while (jdbcRs.previous()) {
                System.out.println(jdbcRs.getString(1) + "\t" +jdbcRs.getString(2)
                         + "\t" + jdbcRs.getString(3));
                if (jdbcRs.getInt("student_id") == 3) {
                    //修改指定记录行
                    jdbcRs.updateString("student_name", "孙悟空");
                    jdbcRs.updateRow();
                } 
            } 
        }        
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        new JdbcRowSetTest().update("SELECT * FROM student_table");
    }
}
