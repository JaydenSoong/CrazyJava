package classes;

public class PrimitiveTransferTest{
    
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // a = 9, b = 6
        System.out.println("swap 方法里，a 的值是：" + a + "，b 的值是：" + b);
    }

    public static void main(String[] args){
        int a = 6, b = 9;
        // java 参数的传递方式是值传递，即将 a、b 的值的副本传递给形参。a、b 不受影响。
        swap(a, b);
        // a = 6, b = 9
        System.out.println("swap 方法结束后，a 的值是：" + a + "，b 的值是：" + b);
    }
}
