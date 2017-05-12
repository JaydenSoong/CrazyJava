package classes;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        Properties prop1 = new Properties();
        // 设置属性，类似 Map 中的 put()
        prop1.setProperty("name", "jayden");
        prop1.setProperty("email", "jiandongsong@126.com");
        // 将属性集输出到文件 a.ini
        prop1.store(new FileOutputStream("a.ini"), "comment lines");

        Properties prop2 = new Properties();
        prop2.setProperty("gender", "male");
        // 加载属性集文件 a.ini，并将 prop2 中设置的属性追加到属性集文件的最后
        prop2.load(new FileInputStream("a.ini"));
        System.out.println(prop2);
    }
}
