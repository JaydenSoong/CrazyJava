package classes;

import java.util.Calendar;
import static java.util.Calendar.MONTH;

public class LenientTest {

    public static void main(String[] args) {
        // 获取实例
        Calendar c = Calendar.getInstance();
        // 设置月份, 超出了 11，上一级为增大
        c.set(MONTH, 13);
        System.out.println(c.getTime());
        // 关闭了容错性
        c.setLenient(false);
        // 设置月份, 超出了 11，导致运行时异常
        // 运行异常： Exception in thread "main" java.lang.IllegalArgumentException: MONTH
        c.set(MONTH, 13);
        System.out.println(c.getTime());
    }
}
