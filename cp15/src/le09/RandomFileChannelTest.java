package le09;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by soong on 17-6-16.
 * RandomAccessFile 的 getChannel() 方法
 */
public class RandomFileChannelTest {
    public static void main(String[] args) {
        File f = new File("a.txt");
        try (//创建一个 RandomAccessFile 对象
             RandomAccessFile raf = new RandomAccessFile(f, "rw");
             //获取 RandomAccessFile 对应的 Channel
             FileChannel randomChannel = raf.getChannel()) {
            //将 Channel 中的所有数据映射成 ByteBuffer
            ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            //把 Channel 的记录指针移动到最后
            randomChannel.position(f.length());
            //将 Buffer 中的所有数据输出
            randomChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
