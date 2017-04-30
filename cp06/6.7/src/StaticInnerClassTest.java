package classes;


public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 9;

    // 静态内部类
    public static class InnerClass {
        // 定义静态成员
        private static int age;
        // 非静态成员
        public void accessOuterProp() {
            // 编译错误: 无法从静态上下文中引用非静态 变量 prop1
            System.out.println(prop1);
            System.out.println(prop2);
        }
    }
}
