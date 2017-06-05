package classes;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;

public class ImageViewer {
    //定义图片预览组件的大小
    final int PREVIEW_SIZE = 100;
    //定义窗口大小
    final int WINDOW_SIZE = 200;
    JFrame jf = new JFrame("简单图片查看器");
    JMenuBar menuBar = new JMenuBar();
    //该label用于显示图片
    JLabel label = new JLabel();
    //以当前路径创建文件选择器
    JFileChooser chooser = new JFileChooser(".");
    JLabel accessory = new JLabel();
    //定义文件过滤器
    ExtensionFileFilter filter = new ExtensionFileFilter();

    public void init () {
        //--------下面开始初始化JFileChooser的相关属性--------
        //创建一个JFileChooser
        filter.addExtension("jpg");
        filter.addExtension("jpeg");
        filter.addExtension("gif");
        filter.addExtension("png");
        filter.setDescription("图片文件(*.jpg,*.jpeg,*.gif,*.png)");
        chooser.addChoosableFileFilter(filter);
        //禁止“文件类型”下拉列表中显示“所有文件”选项
        chooser.setAcceptAllFileFilterUsed(false);
        //为文件选择器指定自定义的FileView对象
        chooser.setFileView(new FileIconView(filter));
        //为文件选择器指定一个预览图片的附件
        chooser.setAccessory(accessory);
        //设置预览图片组件的大小和边框
        accessory.setPreferredSize(new Dimension(PREVIEW_SIZE, PREVIEW_SIZE));
        accessory.setBorder(BorderFactory.createEtchedBorder());
        //用于检测被选择文件的改变事件
        chooser.addPropertyChangeListener(event -> {
            //JFileChooser的被选文件已经发生了改变
            if (event.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
                //获取用户选择的新文件
                File f = (File) event.getNewValue();
                if (f == null) {
                    accessory.setIcon(null);
                    return;
                } 
                //将所选文件读入ImageIcon对象中
                ImageIcon icon = new ImageIcon(f.getPath());
                //如果文件太大，则缩小它
                if (icon.getIconWidth() > PREVIEW_SIZE) {
                    icon = new ImageIcon(icon.getImage().getScaledInstance(
                                PREVIEW_SIZE, -1, Image.SCALE_DEFAULT));
                } 
                //改变accessory Label的图标
                accessory.setIcon(icon);
            }
        });
        //--------下面开始为窗口安装菜单--------
        JMenu menu = new JMenu("文件");
        JMenuItem openItem = new JMenuItem("打开");
        menu.add(openItem);
        menuBar.add(menu);
        //单击openItem菜单项显示“打开文件”对话框
        openItem.addActionListener(event -> {
            //设置文件对话框的当前路径
            chooser.setCurrentDirectory(new File("."));
            //显示文件对话框
            int result = chooser.showDialog(jf, "打开图片文件");
            //如果用户选择了APPROVE(同意)按钮，即打开，保存的等效按钮
            if (result == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            } 
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        //为退出按钮绑定事件监听
        exitItem.addActionListener(event -> System.exit(0));
        jf.setJMenuBar(menuBar);
        //添加用于显示图片的JLabel组件
        jf.add(new JScrollPane(label));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.pack();
        jf.setSize(WINDOW_SIZE, WINDOW_SIZE);
        jf.setVisible(true);
    }

    public static void main (String [] args) {
        new ImageViewer().init();
    }
}
