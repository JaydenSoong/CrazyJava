package classes;

import java.sql.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Vector;
import java.io.IOException;
import static classes.InitParam.*;

public class Executor {
    JFrame jf = new JFrame("查询执行器");
    private JScrollPane scrollPane;
    private JButton execBn = new JButton("查询");
    //用于输入查询语句的文本框
    private JTextField sqlField = new JTextField(45);
    private static Connection conn;
    private static Statement stmt;

    //静态初始化块
    static {
        try {
            initParam("mysql.properties");
            //加载驱动
            Class.forName(driver);
            //建立连接
            conn = DriverManager.getConnection(url, user, pwd);
            //创建语句
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    public void init () {
        JPanel top = new JPanel();
        top.add(new JLabel("输入查询语句："));
        top.add(sqlField);
        top.add(execBn);
        //为执行按钮，文本框添加事件监听
        execBn.addActionListener(new ExceListener());
        sqlField.addActionListener(new ExceListener());
        jf.add(top, BorderLayout.NORTH);
        jf.setSize(680, 480);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    /**
     * 定义监听器
     */
    class ExceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            //删除原来的JTable（JTable使用scrollPane来包装）
            if (scrollPane != null) {
                jf.remove(scrollPane);
            } 
            try (ResultSet rs = stmt.executeQuery(sqlField.getText())) {
                //取出ResultSet的MetaData
                ResultSetMetaData rsmd = rs.getMetaData();
                //由于JTable的构造器需要Vector参数，所以这里使用Vector来存储
                Vector<String> columnNames = new Vector<>();
                Vector<Vector<String>> data = new Vector<>();
                //把ResultSet的所有列名添加到Vector里
                for (int i = 0, n = rsmd.getColumnCount(); i < n; i++) {
                    columnNames.add(rsmd.getColumnName(i + 1));
                }
                //把ResultSet的所有记录添加到Vector里
                while (rs.next()) {
                    Vector<String> v = new Vector<>();
                    for (int i = 0, n = rsmd.getColumnCount(); i < n; i++) {
                        v.add(rs.getString(i + 1));
                    }
                    data.add(v);
                } 
                //创建新的JTable
                JTable table = new JTable(data, columnNames);
                scrollPane = new JScrollPane(table);
                //添加新的Table
                jf.add(scrollPane);
                //更新主窗口
                jf.validate();
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
    }

    public static void main (String [] args) {
        new Executor().init();
    }
}
