package le04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by soong on 17-6-9.
 * 处理流——PrintStream
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt");
             PrintStream ps = new PrintStream(fos)) {
            //使用PrintStream执行输出
            ps.print("普通字符串");
            //使用PrintStream输出对象
            ps.print(new PrintStreamTest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
