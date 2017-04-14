package classes;


public class OverloadVarargs{

    // 只有一个字符串参数的方法
    public void test(String msg){
        System.out.println("只有一个字符串参数的方法");
    }

    // 参数可变的方法
    public void test(String... msgs){
        System.out.println("参数可变的方法");
    }

    public static void main(String[] args) {
        OverloadVarargs olv = new OverloadVarargs();
        olv.test();
        olv.test("Java", "C#");
        olv.test("PHP");
        olv.test(new String[]{"C"});
    }
}
