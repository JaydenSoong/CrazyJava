package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import static java.awt.BorderLayout.*;

public class SimpleDraw {
    private final String RECT_SHAPE = "rect";
    private final String OVAL_SHAPE = "oval";
    private Frame f = new Frame("简单绘图");
    private Button rect = new Button("绘制矩形");
    private Button oval = new Button("绘制圆形");
    private MyCanvas drawArea = new MyCanvas();
    private String shape = "";

    private void init() {
        Panel p = new Panel();
        // 添加监听器，绘制矩形
        rect.addActionListener(e -> {
            shape = RECT_SHAPE;
            drawArea.repaint();
        });
        // 添加监听器，绘制圆形
        oval.addActionListener(e -> {
            shape = OVAL_SHAPE;
            drawArea.repaint();
        });
        p.add(rect);
        p.add(oval);
        // 定义画布大小
        drawArea.setPreferredSize(new Dimension(250, 180));
        f.add(drawArea);
        f.add(p, SOUTH);
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
        new SimpleDraw().init();
    }

    class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            Random rand = new Random();
            if(shape.equals(RECT_SHAPE)) {
                // 设置画笔颜色
                g.setColor(new Color(220, 100, 80));
                // 画一个位置随机，大小固定的矩形
                g.drawRect(rand.nextInt(200), rand.nextInt(120), 40, 60);
            }

            if(shape.equals(OVAL_SHAPE)) {
                g.setColor(new Color(80, 100, 200));
                g.drawOval(rand.nextInt(200), rand.nextInt(120), 50, 40);
            }
        }
    }
}
