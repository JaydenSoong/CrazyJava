package classes;


public class InstanceInitTest{
    // 普通初始化块与声明实例变量指定的默认值按代码顺序执行
    // 普通初始化块
    {
        a = 6;
    }

    int a = 9;

    public static void main(String[] args){
        InstanceInitTest iit = new InstanceInitTest();
        // 9
        System.out.println("a = " + iit.a);
    }
}
