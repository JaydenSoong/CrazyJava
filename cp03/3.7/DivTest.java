package  classes;

public class DivTest{
    
    public static void main(String[] args){
        float a = 3.4f;
        float b = 1.7f;

        // 将输出 2.0
        System.out.println("a / b = " + a / b);

        // 将输出 正无穷大 Infinity
        System.out.println("正整数或正浮点数除以 0.0 的结果是：" + 5.0 / 0.0);

        // 将输出 负无穷大 -Infinity 
        System.out.println("负整数或负浮点数除以 0.0 的结果是：" + - 5 / 0.0);

        // 下面的语句将引发异常 Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println(5 / 0);
    }
}
