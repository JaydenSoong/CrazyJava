package classes;

public class FinalErrorTest{

    // 系统不会对 final 修饰的成员变量进行默认初始化
    final int age;

    {
        // 编译错误: 可能尚未初始化变量age
        // System.out.println(age);
        age = 6;
        System.out.println(age);
    }

    public static void main(String[] args){
        FinalErrorTest fet = new FinalErrorTest();
    }
}
