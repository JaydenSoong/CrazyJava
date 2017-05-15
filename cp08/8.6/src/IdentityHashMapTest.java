package classes;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {

    public static void main(String[] args) {
        IdentityHashMap ihm = new IdentityHashMap();
        // 下面两行代码将会向 IdentityHashMap 中添加两个 key-value 对
        ihm.put(new String("语文"), 89);
        ihm.put(new String("语文"), 90);

        System.out.println(ihm);

        // 下面两行代码将会向 IdentityHashMap 中添加一个 key-value 对
        ihm.put("数学", 100);
        ihm.put("数学", 100);

        System.out.println(ihm);
    }
}
