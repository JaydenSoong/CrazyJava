package classes;


public class Varargs{

    // 定义一个形参个数可变的方法
    public static void test(int a, String... books){
    
        // 将可变的参数作为一个数组处理
        for(String arg : books){
            System.out.println(arg);
        }

        System.out.println(a);
    }
    
    public static void main(String[] args){
        // 调用 test 方法
        test(5, "王阳明全集", "平凡的世界");
    }
}
