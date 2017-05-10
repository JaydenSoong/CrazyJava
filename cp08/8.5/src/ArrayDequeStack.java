package classes;

import java.util.ArrayDeque;

public class ArrayDequeStack {

    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        // 依次将三个元素 push 入栈
        ad.push("123");
        ad.push("abc");
        ad.push("789");
        // [789, abc, 123]
        System.out.println(ad);
        // 访问第一个元素，但并不将其出栈
        // 789
        System.out.println(ad.peek());
        // [789, abc, 123]
        System.out.println(ad);
        // 将第一个元素出栈
        // 789
        System.out.println(ad.pop());
        // [abc, 123]
        System.out.println(ad);
    }
}
