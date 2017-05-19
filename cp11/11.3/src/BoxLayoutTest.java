package classes;

import javax.swing.BoxLayout;
import java.awt.Frame;
import java.awt.Button;
// 静态导入,使用相关常量可以不加类名
import static javax.swing.BoxLayout.*;

public class BoxLayoutTest {
    Frame f = new Frame("测试窗口");
    private void init() {
        // BoxLayou, Y_AXIS让组件竖直排列
        f.setLayout(new BoxLayout(f, Y_AXIS));
        Button bt1 = new Button("First Button");
        Button bt2 = new Button("Second Button");
        f.add(bt1);
        f.add(bt2);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new BoxLayoutTest().init();
    }
}
