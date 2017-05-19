package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.Button;

/**
 * BorderLayout 演示
 * 一般来说，BorderLayout只能装东南西北中五个组件
 * 这里在使用Borderlayout布局的容器中添加另外的容器
 * 让使用BorderLayout布局的容器的实际组件不只五个
 */
public class BorderLayoutTest2 {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");
        // 使用BorderLayout
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("北"), BorderLayout.NORTH);
        f.add(new Button("南"), BorderLayout.SOUTH);
        // 使用 Panel容器
        Panel p = new Panel();
        p.add(new TextField(20));
        p.add(new Button("单击我"));
        // 将 Panel 添加到默认区域（中间）
        f.add(p);
        f.add(new Button("东"), BorderLayout.EAST);
        // 设置最佳显示大小
        f.pack();
        f.setVisible(true);
    }
}
