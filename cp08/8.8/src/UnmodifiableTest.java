package classes;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class UnmodifiableTest {

    public static void main(String[] args) {
        // 创建一个空的，不可变的 List 对象
        List unmodifiableList = Collections.emptyList();
        // 创建一个有元素，且不可变的 Set 对象
        Set unmodifiableSet = Collections.singleton("疯狂 Java 讲义");
        // 创建一个普通的 Map 对象
        Map map = new HashMap();
        map.put("语文", 80);
        map.put("数学", 70);
        // 返回普通 Map 对象的不可变版本
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        // 下面任一一行代码都将引发 UnsupportedOperationException 异常
        unmodifiableList.add("测试元素");
        unmodifiableSet.add("测试元素");
        unmodifiableMap.put("数学", 70);
    }

}
