package classes;

import java.sql.*;
import static classes.InitParam.*;

public class CallableStatementTest {
    public void callProcedure() throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (// 获取连接
             Connection conn = DriverManager.getConnection(url, user, pwd);
             // 创建 CallableStatement 对象
             CallableStatement csmt = conn.prepareCall("{call add_pro(?, ?, ?)}")) {
            csmt.setInt(1, 4);
            csmt.setInt(2, 5);
            // 注册 CallableStatement 的第三个参数是 int 类型
            csmt.registerOutParameter(3, Types.INTEGER);
            // 执行存储过程
            csmt.execute();
            // 获取并输出存储过程传出参数的值
            System.out.println("执行结果是：" + csmt.getInt(3));
        }
    }

    public static void main (String [] args) throws Exception{
        initParam("mysql.properties");
        CallableStatementTest ct = new CallableStatementTest();
        ct.callProcedure();
    }
}
