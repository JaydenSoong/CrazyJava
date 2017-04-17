package classes;


public class VariableOverrideTest{

    // 定义一个 name 实例变量
    private String name = "李刚";
    // 定义一个 price 类变量
    private static double price = 78.0;

    public static void main(String[] args){
        // 定义方法局部变量 price
        int price = 65;
        // 将输出 65，方法内的两名变量覆盖了实例变量
        System.out.println(price);
        // 访问同名的实例变量，需要类名引用
        System.out.println(VariableOverrideTest.price);

        new VariableOverrideTest().info();
    }

    void info(){
        // 方法里的局部变量
        String name = "孙悟空";
        // 将输出局部变量的值
        System.out.println(name);
        // 使用 this 引用，访问实例变量
        System.out.println(this.name);
    }
}
