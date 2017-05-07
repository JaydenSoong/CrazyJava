package classes;

import java.util.Collection;

public class CollectionEach {

    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        // 添加元素
        books.add("轻量级 Java EE 企业应用实战");
        books.add("疯狂 Java 讲义");
        books.add("疯狂 Android 讲义");

        // 调用 forEach() 方法遍历集合
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));
    }
}
