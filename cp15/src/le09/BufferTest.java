package le09;

import java.nio.CharBuffer;

/**
 * Created by soong on 17-6-15.
 * 使用 Buffer
 */
public class BufferTest {
    public static void main(String[] args) {
        //创建 buffer
        CharBuffer buffer = CharBuffer.allocate(8);
        System.out.println("capacity: " + buffer.capacity()); //8
        System.out.println("limit: " + buffer.limit()); //8
        System.out.println("position: " + buffer.position()); //0
        //放入元素
        buffer.put('a');
        buffer.put('b');
        buffer.put('c');
        System.out.println("加入三个元素后，position = " + buffer.position()); //3
        //调用flip()方法
        buffer.flip();
        System.out.println("执行flip()后，limit = " + buffer.limit()); //3
        System.out.println("position = " + buffer.position()); //0
        //取出第一个元素
        System.out.println("第一个元素(position = 0): " + buffer.get()); //a
        System.out.println("取出第一个元素后，position = " + buffer.position()); //1
        //调用clear()方法
        buffer.clear();
        System.out.println("执行clear()后，limit = " + buffer.limit()); //8
        System.out.println("执行clear()后，position = " + buffer.position()); //0
        System.out.println("执行clear()后，缓冲区内容并没有被清除，第三个元素为: " + buffer.get(2)); //c
        System.out.println("执行绝对读取后，position = " + buffer.position()); //0
    }
}
