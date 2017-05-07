package classes;

//import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class IteratorEach {

    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        // 添加元素
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        // 返回一个 Iterator 对象，用于遍历 books 集合
        Iterator it = books.iterator();
        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj)); 
    }
}
