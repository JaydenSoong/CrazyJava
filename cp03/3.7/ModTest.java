package classes;

public class ModTest{

    public static void main(String[] args){
        double a = 5.3;
        double b = 3.1;

        System.out.println(a % b); // 结果是 2.1999999999999997
        System.out.println("整数及零对 0.0 求余的结果是：" + (5 % 0.0) + "\t" + (-5 % 0.0) + "\t" + (0 % 0.0)); // NaN
        System.out.println("零对整数求余的结果是：" + (0 % -5) + "\t" + (0 % 5)); // 0
        System.out.println("0.0 对整数求余的结果是：" + (0.0 % -5) + "\t" + (0.0 % 5)); // 0.0

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println("整数求余 除数不能为 0" + 2 % 0);
    }
}
