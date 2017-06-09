package le03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by soong on 17-6-9.
 * FileOutputStream 测试
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (//创建字节输入流
                FileInputStream fis = new FileInputStream("./src/le03/FileOutputStreamTest.java");
                //创建字节输出流
                FileOutputStream fos = new FileOutputStream("newFile.txt")) {
            byte[] bbuf = new byte[64];
            int hasRead;
            //循环从输入流中读取数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                //每读取一次，即写入文件输出流。
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
