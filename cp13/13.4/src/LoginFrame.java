package classes;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import static classes.InitParam.*;

public class LoginFrame {
    private JFrame jf = new JFrame("登录");
    private JTextField userField = new JTextField(20);
    private JTextField pwdField = new JTextField(20);
    private JButton loginButton = new JButton("登录");

    public void init() throws Exception {
        // 加载驱动
        Class.forName(driver);
        // 为登录按钮添加事件监听
        loginButton.addActionListener(e -> {
            if (validateByPrepare(userField.getText(), pwdField.getText())) {
                JOptionPane.showMessageDialog(jf, "登录成功");
            } else {
                JOptionPane.showMessageDialog(jf, "登录失败");
            }
        });
        jf.add(userField, BorderLayout.NORTH);
        jf.add(pwdField);
        jf.add(loginButton, BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);
    }

    /**
     * 用 Statement 语句的方式
     */
    private boolean validate(String userName, String userPwd) {
        String sql = "SELECT * FROM jdbc_test "
            + "WHERE jdbc_name = '" + userName
            + "' AND jdbc_desc = '" + userPwd + "'";
        System.out.println(sql);
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return true;
            } 
        } catch (Exception e) {
               e.printStackTrace(); 
        }
        return false;
    }

    /**
     * 用 PreparedStatement 语句的方式
     */
    private boolean validateByPrepare(String userName, String userPwd) {
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement pstmt = conn.prepareStatement(
                 "SELECT * FROM jdbc_test WHERE jdbc_name = ? AND jdbc_desc = ?")) {
            pstmt.setString(1, userName);
            pstmt.setString(2, userPwd);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return true;
                } 
            } 
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main (String [] args) throws Exception {
        initParam("mysql.properties");
        new LoginFrame().init();
    }
}
