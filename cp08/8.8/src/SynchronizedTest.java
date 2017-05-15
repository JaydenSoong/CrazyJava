package classes;

import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class SynchronizedTest {

    public static void main(String[] args) {
        // 下面创建了四个线程安全的集合对象
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set set = Collections.synchronizedSet(new HashSet());
        Map map = Collections.synchronizedMap(new HashMap());
    }
}
