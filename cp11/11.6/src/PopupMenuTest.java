package classes;

import java.awt.*;
import java.awt.event.*;

public class PopupMenuTest {
    private Frame f = new Frame("测试");
    // 创建 PopupMenu 实例
    private PopupMenu pop = new PopupMenu();
    private CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
    private MenuItem copyItem = new MenuItem("复制");
    private MenuItem pasteItem = new MenuItem("粘贴");
    // 为注释菜单项添加快捷键 “Ctrl + Shift + /”
    private MenuItem commentItem = new MenuItem("注释", new MenuShortcut(KeyEvent.VK_SLASH, true));
    private MenuItem cancelItem = new MenuItem("取消注释");
    private TextArea ta = new TextArea(6, 40);
    Menu format = new Menu("格式");

    private void init () {
        // 以 Lambda 表达式创建事件监听器
        ActionListener menuListener = e -> {
            String cmd = e.getActionCommand();
            ta.append("单击“" + cmd + "”菜单" + "\n");
            if(cmd.equals("退出")) {
                System.exit(0);
            }
        };

        // 为 commentItem, exitItem 菜单项添加事件监听器
        commentItem.addActionListener(menuListener);
        pop.add(autoWrap);
        pop.addSeparator();
        pop.add(copyItem);
        pop.add(pasteItem);
        pop.add(new MenuItem("-"));
        pop.add(format);
        final Panel p = new Panel();
        p.setPreferredSize(new Dimension(300, 160));
        p.add(pop);
        p.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    pop.show(p, e.getX(), e.getY());
                }
            }
        });
        f.add(p);
        f.add(ta, BorderLayout.NORTH);
        // 以匿名内部类的方式创建事件监听器
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new PopupMenuTest().init();
    }
}
