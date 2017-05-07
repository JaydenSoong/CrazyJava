package classes;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class IteratorTest {

    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        // 添加元素
        books.add("轻量级 Java EE 企业应用实战");
        books.add("疯狂 Java 讲义");
        books.add("疯狂 Android 讲义");

        // 返回一个 Iterator 对象，用于遍历 books 集合
        Iterator it = books.iterator();

        // 遍历集合
        while(it.hasNext()) {
            // it.next() 返回的数据类型是 Object 类型，因此需要强制转型
            String book = (String) it.next();
            System.out.println(book);
            if(book.equals("疯狂 Java 讲义")) {
                // 从集合中删除上一次 next() 方法返回的元素
                it.remove();
            }
            // 对 book 变量赋值，不会改变集合本身
            book = "测试字符串";
        }
        System.out.println(books);
    }
}
