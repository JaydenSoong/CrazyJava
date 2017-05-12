package classes;

import java.util.Map;
import java.util.HashMap;

public class MapTest1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("疯狂 Java 讲义", 109);
        map.put("疯狂 IOS 讲义", 10);
        map.put("疯狂 Ajax 讲义", 79);
        map.put("轻量级 Java EE 企业应用实战", 99);
        // 10
        System.out.println(map.put("疯狂 IOS 讲义", 99));
        System.out.println(map);
        // true
        System.out.println("map 集合的 key 里是否包含“疯狂 Java 讲义”" + map.containsKey("疯狂 Java 讲义"));
        // true
        System.out.println("map 集合的 value 里是否包含 99 " + map.containsValue(99));
        // 遍历 map
        for(Object key : map.keySet()) {
            System.out.println(key + "---->" + map.get(key));
        }
        // 79
        System.out.println(map.remove("疯狂 Ajax 讲义"));
        System.out.println(map);
    }
}
