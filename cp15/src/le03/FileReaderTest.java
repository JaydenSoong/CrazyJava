package le03;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by soong on 17-6-9.
 * FileReader 测试
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try (//创建字符输入流,FileReader实现了AutoCloseable接口，因此可以将其放在try的自动关闭资源括号中
                FileReader fr = new FileReader("./src/le03/FileReaderTest.java")) {
            //创建字符数组，长度为64
            char[] cbuf = new char[64];
            //用于保存实际读取的字符数
            int hasRead;
            //使用循环来重复读取数据
            while ((hasRead = fr.read(cbuf)) > 0) {
                //将读取的字符转成字符串输出
                System.out.println(new String(cbuf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
