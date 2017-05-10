package classes;

import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, FALL, WINTER;
}


public class EnumSetTest1 {

    public static void main(String[] args) {
        // 创建一个 EnumSet 集合，集合元素就是 Season 枚举类的全部枚举值
        EnumSet es1 = EnumSet.allOf(Season.class);
        // [SPRING, SUMMER, FALL, WINTER]
        System.out.println(es1);
        // 创建一个 EnumSet 空集合，指定其集合元素是 Season 类的枚举值
        EnumSet es2 = EnumSet.noneOf(Season.class);
        // []
        System.out.println(es2);
        // 手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        // [SPRING, WINTER]
        System.out.println(es2);
        // 以枚举值创建 EnumSet 集合
        EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        // [SUMMER, WINTER]
        System.out.println(es3);
        // 创建一个从 Season.SUMMER，到 Season.WINTER 枚举值范围内所有枚举值的 EnumSet 集合
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        // [SUMMER, FALL, WINTER]
        System.out.println(es4);
        // 新建 EnumSet 是 es4 的补集
        EnumSet es5 = EnumSet.complementOf(es4);
        // [SPRING]
        System.out.println(es5);
    }
}
