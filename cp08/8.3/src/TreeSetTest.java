package classes;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        // 向 TreeSet 中添加 4 个 Integer 对象
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        // 输出集合元素，看到集合元素已经处于排序状态（自然排序）
        System.out.println(nums);
        // 输出集合里的第一个元素
        System.out.println(nums.first());
        // 输出集合里的最后一个元素
        System.out.println(nums.last());
        // 反回小于 4 的子集，不包含 4。
        System.out.println(nums.headSet(4));
        // 反回大于 5 的子集，如果 Set 中包含 5，子集中还包含 5。
        System.out.println(nums.tailSet(5));
        // 返回大于等于 -3，小于 4 的子集
        System.out.println(nums.subSet(-3,4));
    }
}
