package classes;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {

    public static void main(String[] args) {
        // 创建一个集合
        Collection c = new ArrayList();
        // 添加元素
        c.add("孙悟空");
        // 自动装箱
        c.add(6);
        System.out.println("c 集合元素的个数为：" + c.size());
        // 删除指定元素
        c.remove(6);
        System.out.println("c 集合元素的个数为：" + c.size());
        // 判断是否包含指定字符串
        System.out.println("c 集合是否包含“孙悟空”字符串：" + c.contains("孙悟空"));
        c.add("轻量级 Java EE 企业应用实战");
        System.out.println("c 集合元素：" + c);

        Collection books = new HashSet();
        books.add("轻量级 Java EE 企业应用实战");
        books.add("疯狂 Java 讲义");
        System.out.println("c 是否完全包含 books 集合？" + c.containsAll(books));
        // 用 c 集合减去 books 集合里的元素。
        c.removeAll(books);
        System.out.println("c 集合元素：" + c);
        // 删除 c 集合里的所有元素
        c.clear();
        System.out.println("c 集合元素：" + c);
        // 控制 books 集合里只剩下 c 集合里包含的元素
        books.retainAll(c);
        System.out.println("books 集合元素：" + books);
    }
}
