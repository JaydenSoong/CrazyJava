package classes;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

    public static void main(String[] args) {
        List fixList = Arrays.asList("abc", "nba");
        // java.util.Arrays$ArrayList
        System.out.println(fixList.getClass());
        // 方法引用的方式遍历集合
        fixList.forEach(System.out :: println);
        // 固定长度的集合不能添加、删除元素
        fixList.add("xyz");
        fixList.remove("nba");
    }
}
