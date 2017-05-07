package classes;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {

    public static void main(String[] args) {
        // 创建集合并添加元素
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");

        // 删除符合给定条件的元素
        books.removeIf(ele -> ((String) ele).length() < 10);
        
        System.out.println("删除后的 books 集合为：" + books);
    }
}
