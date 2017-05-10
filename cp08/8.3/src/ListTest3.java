package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.UnaryOperator;

public class ListTest3 {

    public static void main(String[] args) {
        // 创建 List 对象，并添加元素
        List books = new ArrayList();
        books.add(new String("轻量级 Java EE 企业应用实战"));
        books.add(new String("疯狂 Java 讲义"));
        books.add(new String("疯狂 Android 讲义"));
        books.add(new String("疯狂 IOS 讲义"));
        // 匿名内部类的方式实现 sort 方法。
        books.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(books);
        // Lambda 表达式的方式实现 sort 方法
        books.sort((o1, o2) -> ((String)o2).length() - ((String)o1).length());
        System.out.println(books);
        // 匿名内部类的方式实现 replaceAll 方法。
        /*
        books.replaceAll(new UnaryOperator() {
            public Integer apply(Object o) {
                return ((String)o).length();
            }
        });
        */

        // Lambda的方式实现 replaceAll 方法。
        books.replaceAll((o)-> ((String)o).length());
        System.out.println(books);
    }
}
