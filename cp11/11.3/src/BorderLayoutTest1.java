package classes;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;

/**
 * BorderLayout 演示
 */
public class BorderLayoutTest1 {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");      
        // 使用BorderLayout布局，组件的水平间距为20,垂直间距为5
        f.setLayout(new BorderLayout(30, 5));
        // 添加一个按钮组件，静态参数表示组件的位置
        f.add(new Button("北"), BorderLayout.NORTH);
        f.add(new Button("东"), BorderLayout.EAST);
        f.add(new Button("南"), BorderLayout.SOUTH);
        f.add(new Button("西"), BorderLayout.WEST);
        f.add(new Button("中"));
        f.pack();
        f.setVisible(true);

    }
}
