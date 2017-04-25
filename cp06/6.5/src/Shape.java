package classes;


abstract class Shape {
    
    {
        System.out.println("执行 Shape 的初始化块...");
    }

    private String color;

    // 定义一个计算周长的抽象方法
    abstract double calPerimeter();

    // 定义一个返回形状的抽象方法
    abstract String getType();

    // 定义 Shape 的构造器，该构造器并不是用于创建 Shape 对象
    // 而是用于被子类调用
    Shape(){}

    Shape(String color) {
        System.out.println("执行 Shape 构造器");
        this.color = color;
    }

    String getColor(){
        return color;
    }
}
