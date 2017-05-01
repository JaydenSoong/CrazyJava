package classes;


interface A {
    void test();
}


public class ATest {

    public static void main(String[] args) {
        
        int age = 8;
        // 编译错误: 从内部类引用的本地变量必须是最终变量或实际上的最终变量
        // age = 2;
        A a = new A(){
            public void test() {
                // 在 Java 8 以前，下面的语句将提示错误，age 必须使用 final 修饰
                // 从 Java 8 开始，匿名内部类，局部内部类允许访问非 final 的局部变量
                // 但该变量实际上已经是相当于自动使用了 final 修饰。
                System.out.println(age);
            }
        };
        a.test();
    }
}
