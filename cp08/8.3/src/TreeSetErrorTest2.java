package classes;

import java.util.TreeSet;
import java.util.Date;

public class TreeSetErrorTest2 {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // 向 TreeSet 集合中添加两个对象。
        // 运行时异常：java.lang.ClassCastException: classes.T cannot be cast to java.lang.Comparable
        ts.add("人与自然");
        ts.add(new Date());
    }
}
