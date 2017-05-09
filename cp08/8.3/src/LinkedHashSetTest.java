package classes;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {

        LinkedHashSet books = new LinkedHashSet();

        books.add("疯狂 Java 讲义");
        books.add("第一行代码 Android");

        // 输出 [疯狂 Java 讲义, 第一行代码 Android]
        System.out.println(books);
        // 删除 “疯狂 Java 讲义”
        books.remove("疯狂 Java 讲义");
        // 重新添加 “疯狂 Java 讲义”
        books.add("疯狂 Java 讲义");
        // 输出 [第一行代码 Android, 疯狂 Java 讲义]
        System.out.println(books);
    }
}
