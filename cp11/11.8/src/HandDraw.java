package classes;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class HandDraw {
    // 画图区的大小
    private final int AREA_WIDTH = 500;
    private final int AREA_HEIGHT = 400;
    // 上一次鼠标拖动事件的鼠标坐标
    private int preX = -1;
    private int preY = -1;
    // 定义一个右键菜单用于设置画笔颜色
    PopupMenu pop = new PopupMenu();
    MenuItem redItem = new MenuItem("红色");
    MenuItem greenItem = new MenuItem("绿色");
    MenuItem blueItem = new MenuItem("蓝色");
    // 定义一个BufferedImage对象
    BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);
    // 获取image对象的 Graphics
    Graphics g = image.getGraphics();
    private Frame f = new Frame("简单手绘程序");
    private DrawCanvas drawArea = new DrawCanvas();
    // 用于保存颜色
    private Color foreColor = new Color(255, 0, 0);

    private void init () {
        // 定义右键菜单的事件监听器
        ActionListener menuListener = e -> {
            if(e.getActionCommand().equals("绿色")) {
                foreColor = new Color(0, 255, 0);
            }

            if(e.getActionCommand().equals("红色")) {
                foreColor = new Color(255, 0, 0);
            }
            if(e.getActionCommand().equals("蓝色")) {
                foreColor = new Color(0, 0, 255);
            }
        };
        // 为三个菜单项添加事件监听器
        redItem.addActionListener(menuListener);
        greenItem.addActionListener(menuListener);
        blueItem.addActionListener(menuListener);
        // 组合成右键菜单
        pop.add(redItem);
        pop.add(greenItem);
        pop.add(blueItem);
        // 将右键菜单添加到drawArea中。
        drawArea.add(pop);
        // 将Image对象背景色填充成白色
        g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));
        // 监听鼠标移动
        drawArea.addMouseMotionListener(new MouseMotionAdapter() {
            // 实现按下鼠标并拖动的事件处理
            public void mouseDragged(MouseEvent e) {
                if(preX > 0 && preY > 0) {
                    g.setColor(foreColor);
                    g.drawLine(preX, preY, e.getX(), e.getY());
                }
                // 保存鼠标位置
                preX = e.getX();
                preY = e.getY();
                // 重绘drawArea
                drawArea.repaint();
            }
        });
        // 监听鼠标事件
        drawArea.addMouseListener(new MouseAdapter() {
            // 实现鼠标松开的事件处理
            public void mouseReleased(MouseEvent e) {
                // 弹出右键菜单
                if(e.isPopupTrigger()) {
                    pop.show(drawArea, e.getX(), e.getY());
                }
                // 松开鼠标时，把preX，preY设为 -1
                preX = -1;
                preY = -1;
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(drawArea);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new HandDraw().init();    
    }

    class DrawCanvas extends Canvas {
        public void paint(Graphics g) {
            g.drawImage(image, 0, 0, null);
        }
    }
}
