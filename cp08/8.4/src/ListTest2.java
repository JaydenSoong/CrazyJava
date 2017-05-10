package classes;

import java.util.List;
import java.util.ArrayList;

class A {
    // 重写 equals 方法，总是返回 true
    public boolean equals(Object o) {
        return true;
    }
}


public class ListTest2 {
    
    public static void main(String[] args) {
        // 创建 List 对象，并添加元素
        List books = new ArrayList();
        books.add(new String("ABC"));
        books.add(new String("NBA"));
        books.add(new String("XYZ"));
        // 打印 books
        System.out.println(books);
        // 删除一个 new A()，将导致集合第一个元素被删除，因为在执行删除操作时，
        // 会用 A 对象去和集合中的元素比较，由于 A 对象重写了 equals 方法，
        // 总是返回 true，所以会把第一个元素删除
        books.remove(new A());
        // 打印 books
        System.out.println(books);
        // 删除一个 new A(), 将导致集合第二个元素被删除，原因同上。
        books.remove(new A());
        // 打印 books
        System.out.println(books);
    }
}
