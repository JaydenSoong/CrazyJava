package classes;

/**
 * + 不仅可以作为加法运算符使用，还可以作为字符串连接运算符
 */
public class PrimitiveAndString{

    public static void main(String[] args){

        // 下面的表达式将出错，因为一个整数不能直接赋值给一个字符串
        // 不兼容的类型: int无法转换为String
        // String str = 56;

        // 一个基本类型的值和一个字符串进行连接运算时，基本类型的值会自动转换成字符串
        String str = 5.6f + "";
        // 下面将输出 5.6
        System.out.println("str = " + str);

        // 下面将输出 7Hello！
        System.out.println(3 + 4 + "Hello!");

        // 下面将输出 Hello!34
        System.out.println("Hello!" + 3 + 4);
    }
}
