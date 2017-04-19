package classes;


public class StaticInitTest{
    // 静态初始化块与声明实例变量指定的默认值按代码顺序执行
    // 静态初始化块
    static {
        a = 6;
    }

    static int a = 9;

    public static void main(String[] args){
        // 9
        System.out.println("a = " + StaticInitTest.a);
    }
}

