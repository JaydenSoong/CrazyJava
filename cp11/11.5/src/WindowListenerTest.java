package classes;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

/**
 * WindowListener 演示
 */
public class WindowListenerTest {
    private Frame f = new Frame("WindowListener Test");
    private TextArea ta = new TextArea(6, 40);

    private void init() {
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    /**
     * 接口里的方法都是抽象的，需要全部实现——即使用户可以只需要一个功能（windowClosing）
     */
    class MyListener implements WindowListener {
        @Override
        public void windowActivated(WindowEvent e) {
            ta.append("窗口被激活了!\n");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            ta.append("窗口被成功关闭！\n");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            ta.append("用户关闭窗口！\n");
            System.exit(0);
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            ta.append("窗口失去焦点！\n");
        }
        @Override
        public void windowDeiconified(WindowEvent e) {
            ta.append("窗口被恢复！\n");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            ta.append("窗口被最小化！\n");
        }

        @Override
        public void windowOpened(WindowEvent e) {
            ta.append("窗口被再次打开！\n");
        }
    }

    public static void main (String[] args) {
        new WindowListenerTest().init();
    }
}
