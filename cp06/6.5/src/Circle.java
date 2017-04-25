package classes;


public class Circle extends Shape {

    // 定义圆的半径
    private double radius;

    // 圆的构造器
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    // 重写 Shape 的计算周长的方法
    @Override
    double calPerimeter(){
        return 2 * Math.PI * radius;
    }

    // 重写 Shpape 的返回形状的方法
    @Override
    String getType(){
        return getColor() + "圆形";
    }

    public static void main(String[] args) {
        Shape s1 = new Triangle("红色", 3.0, 4.0, 5.0);
        Shape s2 = new Circle("黄色", 2.0);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
