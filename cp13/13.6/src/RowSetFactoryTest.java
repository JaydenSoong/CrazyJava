package classes;

import static classes.InitParam.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.*;

/**
 * JdbcRowSet演示
 */
public class RowSetFactoryTest {
    public void update(String sql) throws Exception {
        //加载驱动
        Class.forName(driver);
        //使用RowSetProvider创建RowSetFactory
        RowSetFactory factory = RowSetProvider.newFactory();
        try (//使用RowSetFactory创建默认的JdbcRowSet()实例
             JdbcRowSet jdbcRs = factory.createJdbcRowSet()) {
            //设置连接信息
            jdbcRs.setUrl(url);
            jdbcRs.setUsername(user);
            jdbcRs.setPassword(pwd);
            //设置查询语句
            jdbcRs.setCommand(sql);
            //执行查询
            jdbcRs.execute();
            //滚动到最后
            jdbcRs.afterLast();
            //向前滚动
            while (jdbcRs.previous()) {
                System.out.println(jdbcRs.getString(1) + "\t" +jdbcRs.getString(2)
                         + "\t" + jdbcRs.getString(3));
                if (jdbcRs.getInt("student_id") == 10) {
                    //修改指定记录行
                    jdbcRs.updateString("student_name", "阿夏");
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
