package classes;

import static classes.InitParam.*;
import javax.sql.rowset.*;
import java.sql.*;

public class CachedRowSetTest {

    public CachedRowSet query(String sql) throws Exception {
        //加载驱动
        Class.forName(driver);
        // try () 里面的内容为可自动关闭资源
        try (//建立连接
             Connection conn = DriverManager.getConnection(url, user, pwd);
             //创建语句
             Statement stmt = conn.createStatement();
             //获取结果集
             ResultSet rs = stmt.executeQuery(sql)) {
            //使用RowSetProvider创建RowSetFactory
            RowSetFactory factory = RowSetProvider.newFactory();
            //创建默认的CachedRowSet实例
            CachedRowSet cachedRs = factory.createCachedRowSet();
            //使用RowSet对象装填RowSet
            cachedRs.populate(rs);
            return cachedRs;
        } 
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        CachedRowSetTest ct = new CachedRowSetTest();
        CachedRowSet cs = ct.query("SELECT * FROM student_table");
        //将指针移动到最后
        cs.afterLast();
        //向前滚动结果集
        while (cs.previous()) {
            System.out.println(cs.getString(1) + "\t" + cs.getString(2) +
                    "\t" + cs.getString(3));
            //修改指定行记录
            if (cs.getInt("student_id") == 3) {
                cs.updateString("student_name", "阿夏");
                cs.updateRow();
            } 
        } 
        //重新获取数据库连接
        Connection conn = DriverManager.getConnection(url, user, pwd);
        conn.setAutoCommit(false);
        //把对RowSet所做的修改同步到底层数据库
        cs.acceptChanges(conn);
    }
}
