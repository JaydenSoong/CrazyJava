package classes;

public class OperatorTest{

    public static void main(String[] args){
        operatorTest();
    }

    public static void operatorTest(){
        
        int a = 4;
        int b = 8;
        
        // 加法 a + b = 12
        System.out.println("a + b = " + (a + b));

        // 连接符 a + b = 48
        System.out.println("a + b = " + a + b);

        // 减法 a - b = -4
        System.out.println("a - b = " + (a - b));

        // 乘法 a x b = 32
        System.out.println("a x b = " + (a * b));

        // 除法 a ÷ b = 0
        System.out.println("a ÷ b = " + (a / b));

        // 按位与 a & b = 0
        System.out.println("a & b = " + (a & b));
        
        // 按位或 a | b = 12
        System.out.println("a | b = " + (a | b));

        // 按位取反 ~ a = -5
        // a: 00000000000000000000000000000100
        // ~a: 11111111111111111111111111111011 这是一个负数（补码形式）
        // -1: 11111111111111111111111111111010
        // ~:  10000000000000000000000000000101 结果是 -5
        System.out.println("~a = " + ~ a);

        // 异或 a ^ b = 12
        System.out.println("a ^ b = " + (a ^ b));

        // 左移 a << 2 = 16
        System.out.println("a << 2 = " + (a << 2));

        // 右移 a >> 2 = 1
        System.out.println("a >> 2 = " + (a >> 2));

        // 右移 -4 >> 2 = -1
        System.out.println("-4 >> 2 = " + (-4 >> 2));

        // 无符号右移 -4 >>> 2 = 
        // 原： 10000000000000000000000000000100
        // 反： 11111111111111111111111111111011
        // 补： 11111111111111111111111111111100
        // 无符号右移：
        //      00111111111111111111111111111111

        // java 7 开始支持的二进制形式
        int d = 0B00111111111111111111111111111111;
        // 返回二进制数的十进制形式，即无符号右移后的结果
        System.out.println(Integer.toString(d));
        System.out.println("-4 >>> 2 = " + (-4 >>> 2));
    }
}
