package classes;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.awt.BorderLayout.*;

/**
 * 事件演示
 */
public class EventQs {
    Frame f = new Frame("Event Test");
    Button setText = new Button("Say Hello");
    TextField tf = new TextField(30);

    private void init() {
        setText.addActionListener(new MyListener());
        f.add(setText);
        f.add(tf, SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new EventQs().init();
    }

    /**
     * 自定义事件监听器作为一个内部类
     * 实现 ActionListener
     */
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You have checked \"Say Hello\"");
            tf.setText("Hello World!");
        }
    }
}


