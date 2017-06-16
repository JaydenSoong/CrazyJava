package le10;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by soong on 17-6-16.
 * Path 接口的功能和用法
 */
public class PathTest {
    public static void main(String[] args) {
        //以当前路径来创建 Path 对象
        Path path = Paths.get(".");
        System.out.println("path 里包含的路径数量：" + path.getNameCount());
        System.out.println("path 的根路径：" + path.getRoot());
        //获取 path 对应的绝对路径
        Path absolutePath = path.toAbsolutePath();
        //获取绝对路径的根路径
        System.out.println("absolutePath 的根路径为：" + absolutePath.getRoot());
        //获取绝对路径所包含的路径数量
        System.out.println("absolutePath 里包含的路径数量为：" + absolutePath.getNameCount());
        System.out.println(absolutePath.getName(4));
        //以多个 String 来构建 Path 对象
        Path path1 = Paths.get("/", "home", "Hello");
        System.out.println(path1);
    }
}
