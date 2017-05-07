package classes;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {
        // 创建集合并添加元素
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");

        // 统计书名包含 “疯狂”子串的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("疯狂")));
        // 统计书名包含 “Java”子串的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
        // 统计书名字符串长度大于 10 的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).length() > 10));
    }

    public static int calAll(Collection books, Predicate p) {
        // 计数变量
        int count = 0;

        // 遍历集合
        for (Object obj : books) {
            
            // 使用 Predicate 的 test() 方法判断该对象是否满足 Predicate 指定的条件
            if (p.test(obj)) {
                count++;
            }
        }
        
        return count;
    }
}
