package classes;

public class ConstructorTest{

    // 定义成员变量
    private String name;
    private int count;

    // 自定义构造器
    public ConstructorTest(String name, int count){
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args){
        ConstructorTest ct = new ConstructorTest("疯狂 Java 讲义", 3000);
        System.out.println(ct.name);
        System.out.println(ct.count);
    }
}
