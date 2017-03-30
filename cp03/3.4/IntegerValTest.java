package classes;

public class IntegerValTest{
    public static void main(String[] args){
        //下面的代码是正确的，系统会自动把 56 当成 byte 类型
        byte a = 56;

        //下面的代码是错误的，系统不会把过大的整数当成 long 来处理。
        //long bigValue = 9999999999999;

        //下面的代码是正确的，要把一个数指定为 long 型时，要在后面加 L 后缀。
        long bigValue = 9999999999999L;

        //以 0 开头的整数值是 8 进制整数
        int octalValue = 013;
        //以 0x 开头的整数值是 16 进制整数
        int hexValue1 = 0x13;
        int hexValue2 = 0xaF;

        /*
         * Java 7 新增了对二进制整数的支持，二进制整数以 0b 或者 0B 开头
         */
        int binVal1 = 0b1001110110;
        byte binVal2 = 0B01101001;
        //byte binVal2 = 32;
        //定义一个32位的二进制整数，最高位是符号位
        int binVal3 = 0B10000000000000000000000000000011;
        System.out.println(binVal1);
        System.out.println(binVal2);
        System.out.println(binVal3);

        /*
         * 定义一个8位的二进制整数，该数值默认占32位，因此它是一个正数
         * 只是强制类型转换成 byte 时产生了溢出，最终导致了 binVal4 的值是 -23
         */
        byte binVal4 = (byte)0B11101001;
        System.out.println(binVal4);

        /*
         * 定义一个32位的进制数，最高位是 1。
         * 但是由于数值后添了 L 后缀，因此该整数实际占 64 位。第 32 位的不是符号位。
         * 所以 binVal5 的值是 2 的31 次方 +2 +1
         */
        long binVal5 = 0b10000000000000000000000000000011L;
        System.out.println(binVal5);
    }
}
