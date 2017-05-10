package classes;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        // 添加 4 个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        // 输出队列，并不是按加入顺序排列
        System.out.println(pq);
        // 循环删除队列元素，观察其从小到大的顺序性
        for(int i = 0; i < 4; i++) {
            System.out.println(pq.poll());
        }
    }
}
