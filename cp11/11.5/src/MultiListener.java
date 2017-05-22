package classes;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.awt.BorderLayout.*;

/**
 * 对一个事件源添加多个监听器演示
 */
public class MultiListener {
    Frame f = new Frame("MultiListener Test");
    TextArea ta = new TextArea(6, 40);
    Button btn1 = new Button("Button 1");
    Button btn2 = new Button("Button 2");
    void init() {
        MyActionListener listener = new MyActionListener(); 
        btn1.addActionListener(listener);
        // 以 Lambda 表达式的方式实现监听器添加
        btn1.addActionListener(e -> ta.append("您单击了" + e.getActionCommand() + "\n"));
        btn2.addActionListener(listener);
        Panel panel = new Panel();
        panel.add(btn1);
        panel.add(btn2);
        f.add(ta);
        f.add(panel, SOUTH);
        f.setVisible(true);
    }

    /**
     * 自定义监听器——以内部类的方式实现
     */
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // getActionCommand() 获取事件源
            ta.append("第一个事件监听器被触发，事件源是：" + e.getActionCommand() + "\n");
        }
    }

    public static void main (String[] args) {
        new MultiListener().init();
    }
}
