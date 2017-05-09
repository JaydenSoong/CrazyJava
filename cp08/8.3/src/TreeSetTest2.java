package classes;

import java.util.TreeSet;

class Z implements Comparable {
    int age;

    public Z (int age) {
        this.age = age;
    }

    // 重写 equals() 方法，总是返回 true
    public boolean equals(Object obj) {
        return true;
    }
   
    // 重写 comparaTo(Object obj) 方法，总是返回 1
    public int compareTo(Object obj) {
        return 1;
    }
}


public class TreeSetTest2 {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Z z1 = new Z(6);
        ts.add(z1);
        // 第二次添加同一个对象，返回 true，说明添加成功
        System.out.println(ts.add(z1));
        // 下面输出 ts 集合，将看到有两个元素
        System.out.println(ts);
        // 修改 ts 集合第一个元素的 age 变量
        ((Z)(ts.first())).age = 9;
        // 输出 ts 集合最后一个元素的 age 变量，将看到它也变成了 9。
        System.out.println(((Z)(ts.last())).age);

    }

}
