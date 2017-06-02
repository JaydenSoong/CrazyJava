package classes;

import java.sql.*;
import static classes.InitParam.*;

public class ResultSetTest {
    public void query(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
             //建立连接
             Connection conn = DriverManager.getConnection(url, user, pwd);
             //创建PreparedStatement对象
             //传入结果集可滚动、可更新的参数
             PreparedStatement pstmt = conn.prepareStatement(
                 sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = pstmt.executeQuery()) {
            rs.last();
            int rowCount = rs.getRow();
            for (int i = rowCount; i > 0 ; i--) {
                rs.absolute(i);
                System.out.println(rs.getString(1) + "\t" 
                        + rs.getString(2) + "\t" + rs.getString(3));
                // 修改记录指针所记录、第2列的值
                rs.updateString(2, "学生名" + i);
                // 提交修改
                rs.updateRow();
            }
        } 
    }

    public static void main (String [] args) throws Exception{
        initParam("mysql.properties");
        ResultSetTest rt = new ResultSetTest();
        rt.query("SELECT * FROM student_table");
    }
}
