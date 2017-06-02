package classes;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;

public class DefaultListModelTest {
    private JFrame mainWin = new JFrame("测试 DefaultListModle");
    // 定义一个JList对象
    private JList<String> bookList;
    // 定义一个defaultListModle对象
    private DefaultListModel<String> bookModel = new DefaultListModel<>();
    private JTextField bookName = new JTextField(20); 
    private JButton removeBn = new JButton("删除选中图书");
    private JButton addBn = new JButton("添加指定图书");

    public void init () {
        //向bookModel中添加元素
        bookModel.addElement("疯狂Java讲义");
        bookModel.addElement("轻量级Java EE企业应用实战");
        bookModel.addElement("疯狂Android讲义");
        bookModel.addElement("疯狂Ajax讲义");
        bookModel.addElement("经典Java EE企业应用实战");
        //根据DefaultListModel创建JList对象
        bookList = new JList<>(bookModel);
        //设置最大可视高度
        bookList.setVisibleRowCount(4);
        //只能单选
        bookList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //为添加按钮添加事件监听器
        addBn.addActionListener(evt -> {
            //当bookName文本框内容不为空时
            if (!bookName.getText().trim().equals("")) {
                //向bookModel中添加一个元素，系统会自动向JList中添加对应的列表项
                bookModel.addElement(bookName.getText());
            } 
        });
        //为删除按钮添加事件监听器
        removeBn.addActionListener(evt -> {
            //如果用户已经选中一行
            if (bookList.getSelectedIndex() >= 0) {
                //从bookModel中添加一个元素，系统会自动从JList中删除对应的列表项
                bookModel.removeElementAt(bookList.getSelectedIndex());
            } 
        });
        JPanel p = new JPanel();
        p.add(bookName);
        p.add(addBn);
        p.add(removeBn);
        //添加bookList组件
        mainWin.add(new JScrollPane(bookList));
        //将p面板添加到窗口中
        mainWin.add(p, BorderLayout.SOUTH);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    } 

    public static void main (String [] args) {
        new DefaultListModelTest().init();
    }
}
