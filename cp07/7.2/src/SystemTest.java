package classes;

import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;

public class SystemTest {
    
    public static void main(String[] args) throws Exception{
        // 获取系统所有的环境变量
        Map<String, String> env = System.getenv();
        for(String name : env.keySet()) {
            System.out.println(name + " ----> " + env.get(name));
        }
        // 获取指定环境变量的值
        System.out.println(System.getenv("OS"));
        // 获取所有的系统属性
        Properties prop = System.getProperties();
        // 将所有系统属性的值保存到 pro.txt 中
        prop.store(new FileOutputStream("pro.txt"), "System properties");
        // 输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
