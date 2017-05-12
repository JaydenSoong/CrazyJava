package classes;

import java.util.HashMap;

public class NullHashMap {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, "被覆盖的value");
        // 根据 key 不能重复的原则。该 key-value 不能被存入，而是用新的
        // value 去覆盖原来的 value。
        map.put(null, null);
        // 可以有多个相同的 value 值。
        map.put("a", null);
        // {null=null, a=null}
        System.out.println(map);
    }
}
