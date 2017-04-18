package classes;

public class Apple extends Fruit{
    public static void main(String[] args){
        // 创建 Apple 对象
        Apple apple = new Apple();
        // Apple 对象本身没有定义 weight 成员变量。此处是继承其父类的成员变量
        apple.weight = 115;
        // 继承父类的方法
        apple.info();
    }

}
