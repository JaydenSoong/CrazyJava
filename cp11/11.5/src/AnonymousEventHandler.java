package classes;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousEventHandler {
    private Frame f = new Frame("AnonymousEventHandler");

    private void init() {
        // 作用匿名内部类作为事件监听器——目前的主流作法
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setBounds(100, 100, 200, 200);
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new AnonymousEventHandler().init();
    }
}
