package classes;

/**
 * 将制类型转换演示
 */
public class NarrowConversion{

    public static void main(String[] args){
        
        int iValue = 233;
        // 强制把一个 int 类型的值转换成 byte 类型的值 
        byte bValue = (byte) iValue;
        // 将输出 -23
        System.out.println("bValue = " + bValue);

        double Pi = 3.14;
        // 强制把一个 double 类型的值转换成 int 类型的值 
        int d = (int) Pi;
        // 将输出 3
        System.out.println("d = " + d);
    }
}
