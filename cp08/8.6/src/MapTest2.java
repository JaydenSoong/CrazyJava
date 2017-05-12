package classes;

import java.util.Map;
import java.util.HashMap;

public class MapTest2 {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("疯狂 Java 讲义", 109);
        map.put("疯狂 IOS 讲义", 99);
        map.put("疯狂 Ajax 讲义", 79);
        // 尝试替换 key 为 “疯狂 XML 讲义”的 value，由于原 Map 中没有对
        // 应的 key。因此 Map 不会改变，不会添加新的 key-value 对
        map.replace("疯狂 XML 讲义", 66);
        System.out.println(map);
        // 使用原 value 与传入参数计算出来的结果覆盖原有的 value
        map.merge("疯狂 IOS 讲义", 10, 
                (oldVal, param) -> (Integer) oldVal + (Integer) param);
        System.out.println(map);
        // 当 key 为“Java”时，其 value 为 null，使用计算的结果作为新 value
        map.computeIfAbsent("Java", (key) -> ((String)key).length());
        System.out.println(map);
        // 当 key 为“Java”对应的 value 存在时，使用计算结果作为新的 value
        map.computeIfPresent("Java", (key, value) -> (Integer) value * (Integer) value);
        System.out.println(map);
    }
}
