package le10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by soong on 17-6-16.
 * Files 类的用法
 */
public class FilesTest {
    public static void main(String[] args) {
        Path path = Paths.get("src/le10/FilesTest.java");
        try {
            //复制文件
            Files.copy(path, new FileOutputStream("b.txt"));
            //判断是否为隐藏文件
            System.out.println("FilesTest.java 是否为隐藏文件：" + Files.isHidden(path));
            //一次性读取文件的所有行
            List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
            System.out.println(lines);
            //判断指定文件的大小
            System.out.println("FilesTest.java 的大小为：" + Files.size(path));
            //将多个字符串内容写入指定文件中
            List<String> poem = new ArrayList<>();
            poem.add("少小离家老大回，");
            poem.add("乡音无改鬓毛衰。");
            Files.write(Paths.get("poem.txt"), poem, Charset.forName("UTF-8"));
            //使用 Java 8 新增的 Stream API 列出当前目录下所有文件和子目录
            Files.list(Paths.get(".")).forEach(System.out::println);
            //使用 Java 8 新增的 Stream API 读取文件内容
            Files.lines(path, Charset.forName("UTF-8")).forEach(System.out::println);
            //判断 “/” 的总空间，可用空间
            FileStore rootStore = Files.getFileStore(Paths.get("/"));
            System.out.println(rootStore.getTotalSpace());
            System.out.println(rootStore.getUsableSpace());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
