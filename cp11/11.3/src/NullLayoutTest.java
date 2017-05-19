package classes;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Toolkit;
import java.awt.Dimension;

public class NullLayoutTest {
    Frame f = new Frame("测试窗口");
    Button btn1 = new Button("第一个按钮");
    Button btn2 = new Button("第二个按钮");

    public void init() {
        f.setLayout(null);
        btn1.setBounds(20, 30, 90, 28);
        btn2.setBounds(50, 45, 120, 35);
        f.add(btn1);
        f.add(btn2);
        // 居中显示
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        f.setBounds((screenSize.width-200) / 2, (screenSize.height-100) / 2, 200, 100);
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new NullLayoutTest().init();
    }
}
