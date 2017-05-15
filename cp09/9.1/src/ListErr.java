package classes;

import java.util.List;
import java.util.ArrayList;


public class ListErr {

    public static void main(String[] args) {
        // 创建一个只想保存字符串的 List 集合
        List strList = new ArrayList();
        strList.add("abc");
        strList.add("xyz");
        // 不小心把一个 Integer 对象放进了集合里
        strList.add(9);
        // 运行时异常
        // ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        strList.forEach(str -> System.out.println(((String)str).length()));
    }
}
