package classes;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;
import java.util.Random;

public class PinBall {
    // 桌面宽度
    private final int TABLE_WIDTH = 300;
    // 桌面高度
    private final int TABLE_HEIGHT = 400;
    //  球拍的垂直位置
    private final int RACKET_Y = 340;
    // 球拍的宽度和高度
    private final int RACKET_HEIGHT = 20;
    private final int RACKET_WIDTH = 60;
    // 球的大小
    private final int BALL_SIZE = 16;
    private Frame f = new Frame("弹球游戏");
    private Random rand = new Random();
    // 小球的纵向运行速度
    private int ySpeed = 10;
    // 返回一个 -0.5 ～ 0.5 的比率，用于控制小球的运行方向。
    private double xyRate = rand.nextDouble() - 0.5;
    // 小球的横向运行速度
    private int xSpeed = (int) (ySpeed * xyRate - 0.5);
    // 小球的坐标
    private int ballX = rand.nextInt(200) + 20;
    private int ballY = rand.nextInt(10) + 20;
    // 球拍的水平位置
    private int racketX = rand.nextInt(200);
    private MyCanvas tableArea = new MyCanvas();
    private Timer timer;
    private boolean isLose = false;

    private void init() {
        tableArea.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
        f.add(tableArea);
        // 定义键盘监听器
        KeyAdapter keyProcessor = new KeyAdapter(){
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    if(racketX > 0) {
                        racketX -= 10;
                    }
                }

                if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if(racketX < TABLE_WIDTH - RACKET_WIDTH) {
                        racketX += 10;
                    }
                }
            }
        };

        // 为窗口和 tableArea 分别添加键盘监听事件
        f.addKeyListener(keyProcessor);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tableArea.addKeyListener(keyProcessor);
        // 定义每 0.1 秒执行一次事件监听器
        ActionListener taskPerformer = evt -> {
            // 如果小球碰到边框
            if(ballX <= 0 || ballX >= TABLE_WIDTH - BALL_SIZE) {
                xSpeed = -xSpeed;
            }
            // 如果小球高度超出了球拍位置，且横向不在球拍范围之内，游戏结束
            if(ballY >= RACKET_Y - BALL_SIZE && (ballX < racketX || ballX > racketX + RACKET_WIDTH)) {
                timer.stop();
                isLose = true;
                tableArea.repaint();
            }
            // 如果小球位于球拍之内，且到达球拍位置，小于反弹
            else if(ballY <= 0 ||(ballY >= RACKET_Y - BALL_SIZE && ballX > racketX && ballX <= racketX + RACKET_WIDTH)) {
                ySpeed = -ySpeed;
            }
            // 小于坐标增加
            ballY += ySpeed;
            ballX += xSpeed;
            tableArea.repaint();
        };

        timer = new Timer(100, taskPerformer);
        timer.start();
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new PinBall().init();    
    }

    class MyCanvas extends Canvas {
        @Override
        public void paint (Graphics g) {
            if(isLose) {
                g.setColor(new Color(255, 0, 0));
                g.setFont(new Font("Times", Font.BOLD, 30));
                g.drawString("游戏已结束!", 50, 200);
            } else {
                g.setColor(new Color(240, 240, 80));
                g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
                g.setColor(new Color(80, 80, 200));
                g.fillRect(racketX, RACKET_Y, RACKET_WIDTH, RACKET_HEIGHT);
            }
        }
    }

}
