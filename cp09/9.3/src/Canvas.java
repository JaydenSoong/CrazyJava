package classes;

import java.util.List;
import java.util.ArrayList;

/**
 *  画布类
 */
public class Canvas {

    /*
    // 不带类型通配符，将使 main 中的 c.drawAll(circleList) 引发异常
    // 不兼容的类型: List<Circle>无法转换为List<Shape>
    public void drawAll(List<Shape> shapes) {
        for(Shape s : shapes) {
            s.draw(this);
        }
    }
    */

    /*
    // 带类型通配符，但需要强转
    public void drawAll(List<?> shapes) {
        for(Object shape : shapes) {
            Shape s = (Shape) shape;
            s.draw(this);
        }
    }
    */

    // 设定通配符上限
    public void drawAll(List<? extends Shape> shapes) {
        for(Shape s : shapes) {
            s.draw(this);
        }
    }

    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        Canvas c = new Canvas();
        c.drawAll(circleList);
    }
}
