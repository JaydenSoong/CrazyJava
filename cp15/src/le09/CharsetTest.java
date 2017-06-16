package le09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.SortedMap;

/**
 * Created by soong on 17-6-16.
 * 获取 Java 所支持的字符集
 */
public class CharsetTest {
    public static void main(String[] args) {
        //获取 Java 支持的全部字符集
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (String alias : map.keySet()) {
            System.out.println(alias + " -----> " + map.get(alias));
        }

        //通过 System 类的 getProperties() 方法来访问本地文件编码格式
        Properties pro = System.getProperties();
        try (FileOutputStream fos = new FileOutputStream("prop.txt")) {
            pro.store(fos, "Pro");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
