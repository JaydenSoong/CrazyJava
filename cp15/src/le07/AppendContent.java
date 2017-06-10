package le07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by soong on 17-6-10.
 * 追加内容
 */
public class AppendContent {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")){
            //移动指针到最后
            raf.seek(raf.length());
            raf.write("追加的内容:\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
