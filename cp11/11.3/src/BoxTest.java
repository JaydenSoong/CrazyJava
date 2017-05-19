package classes;

import javax.swing.Box;
import java.awt.Frame;
import java.awt.Button;
import static java.awt.BorderLayout.*;

public class BoxTest {
    Frame f = new Frame("Box容器测试");
    // 定义水平摆放组件的Box
    Box horizontal = Box.createHorizontalBox();
    // 定义垂直摆放组件的Box
    Box vertical = Box.createVerticalBox();

    private void init() {
        horizontal.add(new Button("Horizontal Button 1"));
        horizontal.add(new Button("Horizontal Button 2"));
        vertical.add(new Button("Vertical Button 1"));
        vertical.add(new Button("Vertical Button 2"));
        f.add(horizontal, NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
   }

   public static void main (String[] args) {
       new BoxTest().init();
   }
}
