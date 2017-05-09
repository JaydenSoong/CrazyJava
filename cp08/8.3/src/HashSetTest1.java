package classes;

import java.util.HashSet;

/**
 * 类 A 的 equals() 方法总是返回 true, 但没有重写其 hashCode() 方法
 */
class A {

    public boolean equlas(Object obj) {
        return true;
    }
}


/**
 * 类 B 的 hashCode() 方法总是返回 1, 但没有重写其 equals() 方法
 */
class B {

    public int hashCode() {
        return 1;
    }
}


/**
 * 类 C 的 hashCode() 方法总是返回 2, 且重写其 equals() 方法总是返回 true
 */
class C {

    public boolean equals(Object obj) {
        return true;
    }

    public int hashCode() {
        return 2;
    }
}


public class HashSetTest1 {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        // 分别向集合中添加两个 A 对象，两个 B 对象，两个 C 对象。
        hs.add(new A());
        hs.add(new A());
        hs.add(new B());
        hs.add(new B());
        hs.add(new C());
        hs.add(new C());
        // 显示 [classes.B@1, classes.B@1, classes.C@2, classes.A@15db9742, classes.A@6d06d69c]
        System.out.println(hs);
    }
}
