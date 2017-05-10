package classes;

import java.util.ArrayDeque;

public class ArrayDequeQueue {

    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        // 将三个元素加入队列
        queue.offer("789");
        queue.offer("abc");
        queue.offer("xyz");
        // [789, abc, xyz]
        System.out.println(queue);
        // 访问头部元素，但并不删除
        // 789
        System.out.println(queue.peek());
        // [789, abc, xyz]
        System.out.println(queue);
        // 访问头部元素，并将其删除
        // 789
        System.out.println(queue.poll());
        // [abc, xyz]
        System.out.println(queue);
    }
}
