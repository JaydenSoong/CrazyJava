package classes;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class IteratorErrorTest {

    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        // 添加元素
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        // 返回一个 Iterator 对象，用于遍历 books 集合
        Iterator it = books.iterator();

        // 遍历集合
        while(it.hasNext()) {
            // it.next() 返回的数据类型是 Object 类型，因此需要强制转型
            String book = (String) it.next();
            System.out.println(book);

            if(book.equals("轻量级Java EE企业应用实战")) {
                // 使用 Iterator 迭代过程中，不可修改集合元素，正面代码将引发异常
                books.remove(book);
            }
        }
        //System.out.println(books);
    }
}
