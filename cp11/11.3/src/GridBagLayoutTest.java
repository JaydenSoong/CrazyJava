package classes;

import java.awt.Frame;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

/**
 * GridBagLayout 演示
 */
public class GridBagLayoutTest {
    private Frame f = new Frame("测试窗口");
    private GridBagLayout gb = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();
    private Button[] bs = new Button[10];

    public void init() {
        f.setLayout(gb);
        for(int i = 0, len = bs.length; i < len; i++) {
            bs[i] = new Button("按钮" + i);
        }
        // 所有组件都可以在横向、纵向上扩大
        gbc.fill = GridBagConstraints.BOTH;
        // 设置组件在水平增加比例权重为1(同等增加)
        gbc.weightx = 1;
        addButton(bs[0]);
        addButton(bs[1]);
        addButton(bs[2]);
        // 横向最后一个组件,以后的就是第二行的了。
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[3]);
        // 组件在横向上不扩大
        gbc.weightx = 0;
        addButton(bs[4]);
        // 组件在横向上占两个网格
        gbc.gridwidth = 2;
        addButton(bs[5]);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[6]);
        // 横向占一个网格
        gbc.gridwidth = 1;
        // 纵向占两个网格
        gbc.gridheight = 2;
        // 纵向上会扩大
        gbc.weighty = 1;
        addButton(bs[7]);
        // 纵向上不扩大 
        gbc.weighty = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        // 纵向占一个网格
        gbc.gridheight = 1;
        addButton(bs[8]);
        addButton(bs[9]);
        // 设置最佳大小
        f.pack();
        f.setVisible(true);
    }

    private void addButton(Button button) {
        gb.setConstraints(button, gbc);
        f.add(button);
    }

    public static void main (String[] args) {
        new GridBagLayoutTest().init();
    }
}
