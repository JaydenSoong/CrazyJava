package classes;

import java.awt.Frame;

public class FrameTest {
    public static void main (String[] args) {
        Frame f = new Frame("测试窗口");
        // 设置窗口的大小、位置
        f.setBounds(30, 30, 250, 220);
        // 将窗口显示出来
        f.setVisible(true);
    }
}
