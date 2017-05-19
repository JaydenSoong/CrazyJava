package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;

/**
 * GridLayout演示
 */
public class GridLayoutTest {
    public static void main (String[] args) {
        Frame f = new Frame("计算器");
        Panel p1 = new Panel();
        p1.add(new TextField(20));
        f.add(p1, BorderLayout.NORTH);
        String[] btn = {"0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9",
            "+", "-", "x", "/", "."};
        Panel p2 = new Panel();
        for(int i=0, len=btn.length; i<len; i++) {
            p2.add(new Button(btn[i]));
        }
        f.add(p2);
        // 设置窗口最佳大小
        f.pack();
        f.setVisible(true);
    }
}
