package classes;


@FunctionalInterface
interface Displayable {
    // 定义一个抽象方法和一个默认方法
    void display();

    default int add (int a, int b) {
        return a + b;
    }
}


public class LambdaAndInner {

    private int age = 12;
    private static String name = "疯狂软件教育中心";

    public void test() {
        String book = "疯狂 Java 讲义";

        Displayable dis = () -> {
            System.out.println("book 局部变量为" + book);
            System.out.println("外部类的 age 实例变量为" + age);
            System.out.println("外部类的 name 类变量为" + name);

            // 编译错误: 可能尚未初始化变量dis
            // System.out.println(dis.add(3, 5));
        };

        dis.display();
        System.out.println(dis.add(3, 5));
    }

    public static void main(String[] args) {

        LambdaAndInner lai = new LambdaAndInner();
        lai.test();
    }
}
