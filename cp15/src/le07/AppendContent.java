package le07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by soong on 17-6-10.
 * 追加内容
 */
public class AppendContent {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")){
            for (int i = 0; i < 100; i++) {
                //移动指针到最后
                raf.seek(raf.length());
                raf.write(("追加的内容:" + i + "\n").getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
