package classes;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import static java.awt.BorderLayout.*;

public class SendMailer extends WindowAdapter{

    private Frame f = new Frame("邮件发送");
    private Button btn = new Button("发送");
    private TextField tf = new TextField(40);

    private void init() {
        btn.addActionListener(new MailerListener(tf));
        // 由于本类继承了 WindowAdapter，所以传入一个本类对象作为窗口监听器
        f.addWindowListener(this);
        f.add(tf);
        f.add(btn, SOUTH);
        f.pack();
        f.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main (String[] args) {
        new SendMailer().init();    
    }
}
