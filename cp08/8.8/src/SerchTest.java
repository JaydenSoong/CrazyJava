package classes;

import java.util.ArrayList;
import java.util.Collections;

public class SerchTest {

    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        // [2, -5, 3, 0]
        System.out.println(nums);
        // 最大元素 3
        System.out.println(Collections.max(nums));
        // 最小元素 -5
        System.out.println(Collections.min(nums));
        // 替换集合中的元素，将 0 替换成 1
        Collections.replaceAll(nums, 0, 1);
        // [2, -5, 3, 1]
        System.out.println(nums);
        // -5 在集合中出出的次数 1
        System.out.println(Collections.frequency(nums, -5));
        // 自然排序
        Collections.sort(nums);
        // 二分法查找元素 3 的索引，输出 3。
        System.out.println(Collections.binarySearch(nums, 3));
    }
}
