package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;

public class PanelTest {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");
        // 创建一个Panel容器
        Panel p = new Panel();
        // 向容器中添加两个组件
        p.add(new TextField(20));
        p.add(new Button("Click Me"));
        // 将Panel容器添加到Frame中
        f.add(p);
        f.setBounds(50, 50, 250, 120);
        f.setVisible(true);
    }
}
