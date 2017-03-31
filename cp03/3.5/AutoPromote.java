package classes;

/**
 * 表达式类型的自动提升
 */

public class AutoPromote{

    public static void main(String[] args){

        short sVal = 3;
        // 下面的表达式将出错
        // 错误: 不兼容的类型: 从int转换到short可能会有损失
        // short sVal1 = sVal + 4;

        byte b = 34;
        char c = 99;
        int i = 27;
        double p = .14;
        // 下面的表达式是正确的，右边的最高等级操作数为 p(double 类型)，所以右边表达式的类型为 double，赋给左边一个 double 类型的变量
        double d = b + c + i + p;
        // 将输出 160.14
        System.out.println("d = " + d);

        int val = 3;
        // 右边表达式的两个操作数都是 int 类型的。故结果也是 int 类型的。虽然除不尽，但仍会得到一个舍弃小数们的 int 类型整数
        int iResult = 23 / val;
        // 将输出 7
        System.out.println("iResult = " + iResult);
    }
}
