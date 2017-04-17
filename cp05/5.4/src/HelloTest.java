package lee;

import lee.sub.Apple;

public class HelloTest{
    public static void main(String[] args){
        // 直接访问相同包下的另一个类，无需使用包前缀
        Hello h = new Hello();

        // 使用命名调用构造器
        lee.sub.Apple a = new lee.sub.Apple();

        // 导包之后，可以不使用命名了。
        Apple aa = new Apple();

    }
}
