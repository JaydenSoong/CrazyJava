package classes;


/**
 * Java 不允许在非静态内部类里定义静态成员
 */
public class InnerNoStatic {
    private class InnerClass {
        // 下面三个静态声明都将引发编译错误
        static {
            System.out.println("============");
        }
        private static int inProp;
        private static void test(){}
    }
}
