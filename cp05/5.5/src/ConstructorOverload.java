package classes;

public class ConstructorOverload{
     // 定义成员变量
    private String name;
    private int count;

    // 无参数构造器
    public ConstructorOverload(){}

    // 自定义构造器
    public ConstructorOverload(String name, int count){
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args){
        // 分别使用两种构造器
        ConstructorOverload ct1 = new ConstructorOverload();
        ConstructorOverload ct2 = new ConstructorOverload("疯狂 Java 讲义", 3000);
        System.out.println(ct1.name + " " + ct1.count);
        System.out.println(ct2.name + " " + ct2.count);
    }
}
