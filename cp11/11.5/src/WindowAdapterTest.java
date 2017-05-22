package classes;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

/**
 * 通过继承适配器而不是实现接口的方式来创建窗口监听器
 */
public class WindowAdapterTest {
    Frame f = new Frame("WindowAdapter Test");

    private void init() {
        f.addWindowListener(new MyListener());
        f.setBounds(50, 50, 200, 200);
        f.setVisible(true);
    }

    // 继承窗口适配器
    class MyListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("关闭窗口...");
            System.exit(0);
        }
    }

    public static void main (String[] args) {
        new WindowAdapterTest().init();
    }
}
