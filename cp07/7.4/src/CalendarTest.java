package classes;

import java.util.Calendar;
// 静态导入
import static java.util.Calendar.*;

public class CalendarTest {

    public static void main(String[] args) {
        // 获取实例
        Calendar c = Calendar.getInstance();
        // 获取年份
        System.out.println(c.get(YEAR));
        // 获取月份
        System.out.println(c.get(MONTH));
        // 获取日期
        System.out.println(c.get(DATE));
        // 设置时间
        c.set(2015, 11, 25, 13, 24, 22);
        // 输出一个 Date 对象
        System.out.println(c.getTime());
        // 向前推进一年
        c.add(YEAR, -1);
        System.out.println(c.getTime());
        // 向前推进 13 个月。
        c.roll(MONTH, -13);
        System.out.println(c.getTime());
    }
}
