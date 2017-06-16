package le09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created by soong on 17-6-16.
 * 文件锁
 */
public class FileLockTest {
    public static void main(String[] args) {
        try (FileChannel fileChannel = new FileOutputStream("a.txt").getChannel()) {
            //使用非阻塞式方式对的指定文件加锁
            FileLock lock = fileChannel.tryLock();
            //程序暂停 10s
            Thread.sleep(1000);
            //释放锁
            lock.release();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
