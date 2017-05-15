package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * 学习 Java 7 以后引入的 “菱形”语法——省略构造器后的具体泛型，
 * 用一对尖括号 “<>” 表示。
 */

public class DiamondTest {

    public static void main(String[] args) {
        // Java 自动判断出 ArrayList的 <> 里应该是 String
        List<String> books = new ArrayList<>();
        books.add("疯狂 Java 讲义");
        books.add("第一行代码 Android");
        // 遍历 books 集合，集合元素就是 String 类型
        books.forEach(book -> System.out.println(book.length()));

        // Java 自动判断出 HashMap 的 <> 里就是 String，List<String>
        Map<String, List<String>> schooleInfo = new HashMap<>();
        // Java 自动判断出 ArrayList的 <> 里应该是 String
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("灵台方寸山");
        schooleInfo.put("孙悟空", schools);
        // 遍历 Map 时，Map 里的 key 是 String 类型，value 是 List<String> 类型
        schooleInfo.forEach((key, value) -> System.out.println(key + "---->" + value));
    }
}

