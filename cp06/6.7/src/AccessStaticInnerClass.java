package classes;


public class AccessStaticInnerClass {

    static class InnerClass {
        private int prop1 = 5;
        private static int prop2 = 9;
    }

    public void accessInnerProp() {
        // 编译错误: 找不到符号
        // System.out.println(prop1);
        // 应该改为通过实例访问静态内部类的实例变量
        System.out.println(new InnerClass().prop1);
        // 编译错误: 找不到符号
        // System.out.println(prop2);
        // 应该改为通过类名访问静态内部类的类变量
        System.out.println(InnerClass.prop2);
    }
}
