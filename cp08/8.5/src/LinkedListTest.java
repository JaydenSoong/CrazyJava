package classes;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList str = new LinkedList();
        // 将字符串元素加入到队列尾部
        str.offer("abc");
        // 在栈顶加入一个元素
        str.push("efg");
        // 将字符串元素加入到队列头部
        str.offerFirst("ijk");
        // 以 List 的方式来遍历集合元素
        for(int i=0; i<str.size(); i++) {
            System.out.println(str.get(i));
        }
        // 访问但不删除栈顶元素
        System.out.println(str.peekFirst());
        // 访问但不删除队列最后一个元素
        System.out.println(str.peekLast());
        // 将栈顶元素出栈
        System.out.println(str.pop());
        System.out.println(str);
        // 访问并删除队列的最后一个元素
        System.out.println(str.pollLast());
        System.out.println(str);
    }
}
