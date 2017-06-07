package classes;

import static classes.InitParam.*;
import javax.sql.rowset.*;
import java.sql.*;

public class CachedRowSetPage {
    public CachedRowSet query(String sql, int pageSize, int page) throws Exception {
        //加载驱动
        Class.forName(driver);
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            //创建默认的RowsetFactory
            RowSetFactory factory = RowSetProvider.newFactory();       
            //创建默认的CachedRowSet
            CachedRowSet crs = factory.createCachedRowSet();
            //设置每页显示pageSize条记录
            crs.setPageSize(pageSize);
            //使用ResultSet来填充RowSet，设置从第几条记录开始。
            crs.populate(rs, (page -1) * pageSize + 1);
            return crs;
        } 
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        CachedRowSetPage crsp = new CachedRowSetPage();
        CachedRowSet crs = crsp.query("SELECT * FROM student_table", 5, 3);
        while (crs.next()) {
            System.out.println(crs.getString(1) + "\t" +
                    crs.getString(2) + "\t" + crs.getString(3));
        }
    }
}
