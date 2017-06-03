package classes;

import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HandDraw {
    //画图区的宽度
    private final int AREA_WIDTH = 500;
    //画图区的高度
    private final int AREA_HEIGHT = 400;
    //上一次鼠标拖动事件的鼠标坐标
    private int preX = -1;
    private int preY = -1;
    //定义一个右键菜单用于设置画笔颜色
    JPopupMenu pop = new JPopupMenu();
    JMenuItem chooseColor = new JMenuItem("选择颜色");
    //定义一个BufferedImage对象
    BufferedImage image = new BufferedImage(
            AREA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);
    //获取image对象的Graphics
    Graphics g = image.getGraphics();
    private JFrame f = new JFrame("简单手绘程序");
    private DrawCanvas drawArea = new DrawCanvas();
    //用于保存画笔颜色
    private Color foreColor = new Color(255, 0, 0);

    public void init() {
        chooseColor.addActionListener(ae -> {
            final JColorChooser colorPane = new JColorChooser(foreColor);
            JDialog jd = JColorChooser.createDialog(f, "选择画笔颜色", false,
                    colorPane,e -> foreColor = colorPane.getColor(), null);
            jd.setVisible(true);
        });
        //将菜单项组合成右键菜单
        pop.add(chooseColor);
        //将右键菜单添加到drawArea对象中
        drawArea.setComponentPopupMenu(pop);
        //将image对象的背景填充成白色
        g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));
        //监听鼠标移动事件
        drawArea.addMouseMotionListener(new MouseMotionAdapter() {
            //实现按下鼠标键度拖动的事件处理
            public void mouseDragged(MouseEvent e) {
                if (preX > 0 && preY > 0) {
                    //设置当前颜色
                    g.setColor(foreColor);
                    //绘制上一次鼠标点到本次鼠标点的线段
                    g.drawLine(preX, preY, e.getX(), e.getY());
                } 
                //保存本次鼠标点
                preX = e.getX();
                preY = e.getY();
                //重绘
                drawArea.repaint();
            }
        });
        //监听鼠标事件
        drawArea.addMouseListener(new MouseAdapter() {
            //实现鼠标松开的事件处理
            public void mouseReleased(MouseEvent e) {
                preX = -1;
                preY = -1;
            }
        });
        f.add(drawArea);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String [] args) {
        new HandDraw().init();
    }

    //让画图区域继承Jpanel类
    class DrawCanvas extends JPanel {
        //重写Jpanel的paint方法，实现绘画
        @Override
        public void paint(Graphics g) {
            //将image绘制到该组件上
            g.drawImage(image, 0, 0, null);
        }
    }
}
