package classes;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionStream {

    public static void main(String[] args) {
        // 创建集合并添加元素
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");

        // 统计书名包含 “疯狂”子串的图书数量
        System.out.println(books.stream().filter(ele -> ((String) ele).contains("疯狂")).count());
        // 统计书名包含 “Java”子串的图书数量
        System.out.println(books.stream().filter(ele -> ((String) ele).contains("Java")).count());
        // 统计书名字符串长度大于 10 的图书数量
        System.out.println(books.stream().filter(ele -> ((String) ele).length() > 10).count());

        System.out.println("--------");

        // 先调用 Collection 对象的 stream() 方法将集合转成 Stream
        // 再调用 Stream 的 mapToInt() 方法获取原有 Stream 对应的 IntStream
        books.stream().mapToInt(ele -> ((String) ele).length())
            // 调用 forEach() 方法遍历 IntStream 的每个元素
            .forEach(System.out::println);
    }
}
