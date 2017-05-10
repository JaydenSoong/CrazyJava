package classes;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Collection;

public class EnumSetTest2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.clear();
        c.add(Season.SPRING);
        c.add(Season.FALL);
        // 复制 Collection 集合中的所有元素来创建 EnumSet 集合
        EnumSet es = EnumSet.copyOf(c);
        System.out.println(es);
        c.add("疯狂 Java 讲义");
        c.add("第一行代码 Android");
        // 下面代码将出现异常，因为 c 集合里的元素不全是枚举值 
        es = EnumSet.copyOf(c);
    }
}
