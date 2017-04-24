package classes;

public class FinalReplaceTest{

    public static void main(String[] args){
        // 下面定义了 4 个“宏变量”
        final int a = 5 + 2;
        final double b = 2.1;
        final String str = "疯狂" + "Java";
        final String book = "疯狂Java讲义" + 99.0;

        // 下面的 book2 变量因为调用了方法，所以在编译时无法确定下来，所以不是“宏变量”
        final String book2 = "疯狂Java讲义" + String.valueOf(99.0);

        System.out.println(book == "疯狂Java讲义99.0");
        System.out.println(book2 == "疯狂Java讲义99.0");
    }
}
