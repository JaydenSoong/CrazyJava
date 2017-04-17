package classes;

public class Apple{
    // 定义成员变量
    private String name;
    private String color;
    private double weight;

    // 无参构造器
    public Apple(){}

    // 两个参数构造器
    public Apple(String name, String color){
        this.name = name;
        this.color = color;
    }

    // 在一个构造器中调用另一个构造器，必须做为构造器执行的第一条语句
    public Apple(String name, String color, double weight){
        this(name, color);
        this.weight = weight;
    }
}
