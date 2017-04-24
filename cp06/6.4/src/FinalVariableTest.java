package classes;

public class FinalVariableTest{

    // 定义成员变量时指定默认值，合法
    final int a = 6;
    // 下面变量将在构造器或初始化块中分配初始值
    final String str;
    final int c;
    final static double d;
    // 没有指定默认值，也没有在初始化块或构造器中赋值的变量是不合法的
    // final char ch;

    // 初始化块，可对没有指定值的实例变量指定初始值
    {
        // 在初始化块中为实例变量指定初始值，合法
        str = "Hello";
        // 定义 a 的时候已经指定了默认值。
        // 错误: 无法为最终变量a分配值
        // a = 9;
    }

    // 静态初始化块，可对没有指定值的类变量指定初始值
    static {
        // 在静态初始化块中为类变量指定初始值，合法
        d = 5.6;
    }

    // 构造器，可对既没有指定默认值，又没有在初始化块中指定初始值的实例变量指定初始值
    public FinalVariableTest(){
        c = 5;
        // 在初始化块或定义时指定了初始值，构造器不能重新赋值
        // 编译错误: 可能已分配变量str
        // str = "java";
    }

    public void changeFinal(){
        // 普通方法不能为 final 修饰的成员变量赋值
        // 编译错误：无法为最终变量d分配值
        // d = 1.2;
        // 普通方法不能为 final 修饰的成员变量赋值
        // 编译错误：无法为最终变量ch分配值
        // ch = 'a';
    }

    public static void main(String[] args){
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println("a = " + ft.a);
        System.out.println("c = " + ft.c);
        System.out.println("d = " + d);
    }


}
