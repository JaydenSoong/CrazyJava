package le03;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by soong on 17-6-9.
 * FileInputStream 测试
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        try (//创建字节输入流,FileInputStream实现了AutoCloseable接口，因此可以将其放在try的自动关闭资源括号中
                FileInputStream fis = new FileInputStream("./src/le03/FileInputStreamTest.java")) {
            //创建字节数组，长度为1024
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasRead;
            //使用循环来重复读取数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                //将读取的字节转成字符串输出
                System.out.println(new String(bbuf, 0, hasRead));
            }
        }
    }
}
