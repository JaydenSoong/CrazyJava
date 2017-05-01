package classes;


public class LocalInnerClass {

    public static void main(String[] args) {
        // 定义局部内部类
        class InnerBase {
            int a;
        }
        // 定义局部内部类的子类
        class InnerSub extends InnerBase {
            int b;
        }
        InnerSub is = new InnerSub();
        is.a = 5;
        is.b = 8;
        System.out.println("InnerSub 对象的 a 和 b 实例变量是："
                + is.a + ", " + is.b);
    }
}
