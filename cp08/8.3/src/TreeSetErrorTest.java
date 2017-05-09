package classes;

import java.util.TreeSet;

class T {}
public class TreeSetErrorTest {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // 向 TreeSet 集合中添加两个对象。
        // 运行时异常：java.lang.ClassCastException: classes.T cannot be cast to java.lang.Comparable
        ts.add(new T());
        ts.add(new T());
    }
}
