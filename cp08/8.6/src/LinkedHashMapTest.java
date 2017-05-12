package classes;

import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap(); 
        scores.put("语文", 45);
        scores.put("数学", 35);
        scores.put("英文", 25);
        // 调用 forEach 方法遍历 scores 里的所有 key-value 对
        scores.forEach((key, value) -> System.out.println(key + "---->" + value));
        scores.forEach(new BiConsumer(){
            public void accept(Object key, Object value) {
                System.out.println(key + "--->" + value);
            }
        });
    }
}
