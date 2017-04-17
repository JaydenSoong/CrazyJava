package classes;


public class MethodLocalVariableTest{

    public static void main(String[] args){
        // 定义一个方法局部变量 a
        int a;
        //  错误: 可能尚未初始化变量a
        // System.out.println(a);
        // 初始化 a
        a = 5;
        System.out.println(a);

    }
}
