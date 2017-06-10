package le07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by soong on 17-6-10.
 * RandomAccessFile 使用
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("./src/le07/RandomAccessFileTest.java", "r")){
            //获取RandomAccessFile的初始指针位置，为0。
            System.out.println("RandomAccessFile 对象的初始指针位置：" + raf.getFilePointer());
            //移动指针位置
            raf.seek(300);
            byte[] bbuf = new byte[1024];
            int hasRead;
            while ((hasRead = raf.read(bbuf)) > 0) {
                System.out.println(new String(bbuf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
