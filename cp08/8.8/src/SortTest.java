package classes;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(4);
        list.add(-3);
        list.add(9);
        list.add(0);
        System.out.println(list);
        // 将集合元素的顺序反转
        Collections.reverse(list);
        System.out.println(list);
        // 将集合元素按自然顺序排序
        Collections.sort(list);
        System.out.println(list);
        // 将集合元素随机排序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
