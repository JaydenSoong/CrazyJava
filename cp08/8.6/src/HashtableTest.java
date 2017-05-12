package classes;

import java.util.Hashtable;

class A {
    int count;

    public A(int count) {
        this.count = count;
    }

    // 根据 count 值来判断两个对象是否相等
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o != null && o.getClass() == A.class) {
            A a = (A) o;
            return this.count == a.count;
        }

        return false;
    }

    // 根据 count 值来计算 hashCode 值
    public int hashCode() {
        return this.count;
    }
}


class B {
    // 重写 equals 方法，B 对象与任何对象通过 equals 方法比较都返回 true
    public boolean equals(Object o) {
        return true;
    }
}


public class HashtableTest {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(6845), "黄光成");
        ht.put(new A(8150), "朱小波");
        ht.put(new A(6188), new B());
        System.out.println(ht);
        // true, 原因 B 重写了 equals 方法，总是 true
        System.out.println(ht.containsValue("樊永红"));
        // true, A 的 equals 方法返回 true，hashCode 相等
        System.out.println(ht.containsKey(new A(8150)));
        // 成功删除，原因同上
        System.out.println(ht.remove(new A(8150)));
        System.out.println(ht);
    }
}
