package classes;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 书中实验
 * P318
 * 并不严谨，keySet() 返回的集合的顺序是不明确的。
 */

public class HashMapErrorTest {
    
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(new A(6000), "黄光成");
        map.put(new A(1328), "张无纪");
        Iterator it = map.keySet().iterator();
        A first = (A) it.next();
        first.count = 1328;
        System.out.println(map);
        map.remove(new A(1328));
        System.out.println(map);
        System.out.println(map.get(new A(1328)));
        System.out.println(map.get(new A(6000)));
    }
}
