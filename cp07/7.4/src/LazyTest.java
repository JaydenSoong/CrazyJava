package classes;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;

public class LazyTest {

    public static void main(String[] args) {
        // 获取实例
        Calendar c = Calendar.getInstance();
        // 设置时间
        c.set(2016, 7, 31);
        // 将月份设置为 9，但 9 月 31 日不存在。
        // 如果立即修改，系统会把 cal 自动调整到 10 月 1 日。
        c.set(MONTH, 8);
        // 下面代码输出 10 月 1 日。
        // System.out.println(c.getTime());

        // 设置 DATE 字段为 5。
        c.set(DATE, 5);
        System.out.println(c.getTime());
    }
}
