package classes;

/**
 * 继承自 Shape 的类
 */
public class Circle extends Shape {
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布" + c + "上画一个圆");
    }
}
