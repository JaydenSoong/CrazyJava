package classes;

public class UnsignedTest{

    public static void main(String[] args){
        byte b = -3;
        // 将 byte 类型的数转成无符号整数
        System.out.println("byte 类型的 -3 对应的无符号整数：" + Byte.toUnsignedInt(b));
        // 指定使用 16 进制解析无符号整数
        int val = Integer.parseUnsignedInt("ab", 16);
        System.out.println(val);
        // 将 -12 转成无符号 int 型，然后转换成十六进制字符串
        System.out.println(Integer.toUnsignedString(-12, 16));
        // 将两个数转成无符号整数后相除
        System.out.println(Integer.divideUnsigned(-2, 3));
        // 将两个数转成无符号整数后求余
        System.out.println(Integer.remainderUnsigned(-2, 7));
    }
}
