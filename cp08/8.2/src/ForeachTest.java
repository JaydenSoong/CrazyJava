package classes;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class ForeachTest{

    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        // 添加元素
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        for (Object obj : books) {
            String book = (String) obj;
            System.out.println(book);

            if(book.equals("轻量级Java EE企业应用实战")) {
                // 使用 Iterator 迭代过程中，不可修改集合元素，正面代码将引发异常
                books.remove(book);
            }
        }
    }
}
