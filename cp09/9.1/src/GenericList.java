package classes;

import java.util.List;
import java.util.ArrayList;


public class GenericList {

    public static void main(String[] args) {
        // 创建一个只能保存字符串的 List 集合
        List<String> strList = new ArrayList<String>();
        strList.add("abc");
        strList.add("xyz");

        // 不小心把一个 Integer 对象放进了集合里
        // 将引起编译错误
        // strList.add(9);

        // 不需要再强制转型
        strList.forEach(str -> System.out.println(str.length()));
    }
}
