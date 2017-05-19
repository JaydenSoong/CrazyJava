package classes;

import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.Button;

public class ScrollPaneTest {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");
        // 创建一个ScrollPane容器
        ScrollPane p = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        // 向容器中添加两个组件
        p.add(new TextField(20));
        p.add(new Button("Click Me"));
        // 将ScrollPane容器添加到Frame中
        f.add(p);
        f.setBounds(50, 50, 250, 120);
        f.setVisible(true);
    }
}
