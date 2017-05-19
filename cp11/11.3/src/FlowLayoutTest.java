package classes;

import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;

/**
 * FlowLayout 流布局演示
 */
public class FlowLayoutTest {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        for(int i=1; i<10; i++) {
            f.add(new Button("按钮" + i));
        }
        // 设置窗口为最佳大小
        f.pack();
        f.setVisible(true);
    }
}
