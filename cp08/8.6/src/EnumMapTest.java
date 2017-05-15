package classes;

import java.util.EnumMap;

enum Season {
    SPRING, SUMMER, FALL, WINTER;
}


public class EnumMapTest {

    public static void main(String[] args) {
        // 创建 EnumMap 对象，该 EnumMap 的所有 key 都是 Season 枚举类的枚举值
        EnumMap emap = new EnumMap(Season.class);
        emap.put(Season.SPRING, "春暖花开");
        emap.put(Season.SUMMER, "夏日炎炎");
        System.out.println(emap);
    }
}
