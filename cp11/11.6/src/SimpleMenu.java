package classes;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.CheckboxMenuItem;
import java.awt.TextArea;
import java.awt.MenuShortcut;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;

public class SimpleMenu {
    private Frame f = new Frame("测试");
    private MenuBar mb = new MenuBar();
    private Menu file = new Menu("文件");
    private Menu edit = new Menu("编辑");
    private MenuItem newItem = new MenuItem("新建");
    private MenuItem saveItem = new MenuItem("保存");
    // 为退出菜单项添加快捷键 “Ctrl + X”
    private MenuItem exitItem = new MenuItem("退出", new MenuShortcut(KeyEvent.VK_X));
    private CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
    private MenuItem copyItem = new MenuItem("复制");
    private MenuItem pasteItem = new MenuItem("粘贴");
    private Menu format = new Menu("格式");
    // 为注释菜单项添加快捷键 “Ctrl + Shift + /”
    private MenuItem commentItem = new MenuItem("注释", new MenuShortcut(KeyEvent.VK_SLASH, true));
    private MenuItem cancelItem = new MenuItem("取消注释");
    private TextArea ta = new TextArea(6, 40);

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
        exitItem.addActionListener(menuListener);
        // 为 file 菜单添加菜单项
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        // 为 edit 菜单添加菜单项
        edit.add(autoWrap);
        // 添加菜单分隔
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        // 为 format 菜单添加菜单项
        format.add(commentItem);
        format.add(cancelItem);
        // 添加菜单分隔
        edit.add(new MenuItem("-"));
        // 将 format 菜单添加到 edit 菜单中
        edit.add(format);
        mb.add(file);
        mb.add(edit);
        f.setMenuBar(mb);
        // 以匿名内部类的方式创建事件监听器
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new SimpleMenu().init();
    }
}
