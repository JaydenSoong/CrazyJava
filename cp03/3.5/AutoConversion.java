package classes;

/**
 * 自动类型转换演示
 */
public class AutoConversion{
    public static void main(String[] args){
        // int 类型可以自动转换成 float 类型
        int i = 6;
        float f = i;
        // 下面将输出 6.0;
        System.out.println("f = " + f);

        byte b = 8;
        // 下面的表达式将出错，byte 类型不可以自动转换成 char 类型
        // 错误: 不兼容的类型: 从byte转换到char可能会有损失
        // char c = b;

        // int 类型可以自动转换成 double类型
        double d = b;
        // 下面将输出 8.0
        System.out.println("d = " + d);
    }
}
