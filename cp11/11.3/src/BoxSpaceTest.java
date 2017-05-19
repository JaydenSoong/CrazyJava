package classes;

import javax.swing.Box;
import java.awt.Frame;
import java.awt.Button;
import static java.awt.BorderLayout.*;

public class BoxSpaceTest {
    Frame f = new Frame("Box space test");
    Box horizontal = Box.createHorizontalBox();
    Box vertical = Box.createVerticalBox();

    private void init() {
        horizontal.add(new Button("horizontal button1"));
        // 创建一条水平方向上可以拉伸的间距
        horizontal.add(Box.createHorizontalGlue());
        horizontal.add(new Button("horizontal button2"));
        // 创建一条水平方向上不可以拉伸的间距, 宽度为20
        horizontal.add(Box.createHorizontalStrut(20));
        horizontal.add(new Button("horizontal button3"));
        vertical.add(new Button("vertical button1"));
        // 创建一条垂直方向上可以拉伸的间距
        vertical.add(Box.createVerticalGlue());
        vertical.add(new Button("vertical button2"));
        // 创建一条垂直方向上不可以拉伸的间距, 宽度为20
        vertical.add(Box.createVerticalStrut(20));
        vertical.add(new Button("vertical button3"));
        f.add(horizontal, NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    } 

    public static void main (String[] args) {
        new BoxSpaceTest().init();
    }
}
