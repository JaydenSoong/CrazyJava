package classes;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

    public static void main(String[] args) {
        // 创建 List 对象，并添加元素
        List books = new ArrayList();
        books.add(new String("轻量级 Java EE 企业应用实战"));
        books.add(new String("疯狂 Java 讲义"));
        books.add(new String("疯狂 Android 讲义"));
        // 输出 List 对象 
        System.out.println(books);
        // 在索引为 1 的位置添加新的元素
        books.add(1, new String("疯狂 Ajax 讲义"));
        // for 遍历
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        // 删除第 3 个元素
        books.remove(2);
        // 输出 List 对象 
        System.out.println(books);
        // 判断 疯狂 Ajax 讲义的位置。
        // 这里是通过 new 关键字创建一个新对象。但仍能返回 1。
        // List 是通过 equals 的方法来判断相等
        System.out.println(books.indexOf(new String("疯狂 Ajax 讲义")));
        // 替换第二个元素为 疯狂 Java 讲义
        books.set(1, new String("疯狂 Java 讲义"));
        // 输出 List 对象 
        System.out.println(books);
        // 截取子串 [1, 2）
        System.out.println(books.subList(1, 2));
    }
}
