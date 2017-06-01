package classes;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * InitParam 工具类
 * 用来加载保存数据库连接信息的属性文件
 */
public class InitParam {
    static String driver;
    static String url;
    static String user;
    static String pwd;

    /**
     * @paramFile 数据库接连信息文件
     */
    public static void initParam(String paramFile) throws IOException {
        // 使用 Properties 类来加载属性文件
        Properties prop = new Properties();
        prop.load(new FileInputStream(paramFile));
        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        user = prop.getProperty("user");
        pwd = prop.getProperty("pwd");
    }
} 
