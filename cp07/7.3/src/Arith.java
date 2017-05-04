package classes;

import java.math.BigDecimal;

/**
 * 自定义工具类，提供精确的加、减、乘、除运算
 */
public class Arith {

    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    // 将构造器私有，不能 new 实例
    private Arith(){}

    // 加法运算
    public static double add(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.add(b2).doubleValue();
    }
    
    // 减法运算
    public static double sub(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.subtract(b2).doubleValue();
    }

    // 乘法运算
    public static double mul(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.multiply(b2).doubleValue();
    }

    // 除法运算
    public static double div(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
