package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

/**
 * CardLayout 演示
 */
public class CardLayoutTest {
    private void init() {
        Frame f = new Frame("测试窗口");
        Panel pl = new Panel();
        final CardLayout c = new CardLayout();
        initCardPanel(pl, c);
        f.add(pl);
        ActionListener listener = e -> {
            switch(e.getActionCommand()) {
                case "上一张":
                    c.previous(pl);
                    break;
                case "下一张":
                    c.next(pl);
                    break;
                case "第一张":
                    c.first(pl);
                    break;
                case "最后一张":
                    c.last(pl);
                    break;
                case "第三张":
                    c.show(pl, "第三张");
                    break;
            }
        };
        Panel p = new Panel();
        initButtonPanel(listener, p);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    /**
     * 初始化窗口上部的使用CardLayout布局的面板
     */
    private void initCardPanel(Panel p, CardLayout c) {
        p.setLayout(c);
        String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张"};
        for(int i = 0, len = names.length; i < len; i++) {
            // add(String name, Component comp) 这里一定要使用有名称的add()方法。
            p.add(names[i], new Button(names[i]));
        }
    }

    /**
     * 初始化窗口下部的按钮面板
     */
    private void initButtonPanel(ActionListener listener, Panel p) {
        Button previous = new Button("上一张");
        previous.addActionListener(listener);
        Button next = new Button("下一张");
        next.addActionListener(listener);
        Button first = new Button("第一张");
        first.addActionListener(listener);
        Button last = new Button("最后一张");
        last.addActionListener(listener);
        // 根据 Card 名显示按钮
        Button third = new Button("第三张");
        third.addActionListener(listener);

        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
    }
        
    public static void main (String[] args) {
        new CardLayoutTest().init();
    }
}
