package classes;

public class FloatTest{
    public static void main(String[] args){
        float af = 3.1415926f;
        // af 的值已经发生了改变 
        System.out.println("af = " + af);
        double a = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        // Float 和 Double 的负无穷大是相等的
        System.out.println(c == d);
        // 0.0 除以 0.0 将得到非数
        System.out.println(a / a);
        // 两个非数之间是不相等的。
        System.out.println(a / a == Float.NaN);
        // 所有正无穷大都是相等的
        System.out.println(6.0 / 0 == 555.0 / 0);
        // 负数除以 0.0 得到负无穷
        System.out.println(-5.0 / 0.0);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println(3 / 0);
    }
}
