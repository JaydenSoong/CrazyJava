package classes;

public class FinalLocalVariableTest{

    public void test(final int a){
        // 编译错误: 不能分配最终参数a
        // a = 5;
    }

    public static void main(String[] args){
        final String str = "hello";
        // 编译错误: 无法为最终变量str分配值，final 修饰的变量无法重新赋值
        // str = "java";
        final double d;
        d = 5.6;
        // 编译错误: 可能已分配变量d，final 修饰的变量无法重新赋值
        // d = 3.4;
    }
}
