package le10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.Date;

/**
 * Created by soong on 17-6-19.
 * 访问文件属性
 */
public class AttributeViewTest {
    public static void main(String[] args) throws IOException {
        Path testPath = Paths.get("src/le10/AttributeViewTest.java");
        //获取文件的基本属性 BasicFileAttributeView
        BasicFileAttributeView basicView = Files.getFileAttributeView(
                testPath, BasicFileAttributeView.class);
        //获取基本属性
        BasicFileAttributes basicAttribs = basicView.readAttributes();
        //访问文件的基本属性
        System.out.println("创建时间：" + new Date(basicAttribs.creationTime().toMillis()));
        System.out.println("最后访问时间：" + new Date(basicAttribs.lastAccessTime().toMillis()));
        System.out.println("最后修改时间：" + new Date(basicAttribs.lastModifiedTime().toMillis()));
        System.out.println("文件大小：" + basicAttribs.size());
        //获取拥有者信息
        FileOwnerAttributeView fileOwnAttrs = Files.getFileAttributeView(
                testPath, FileOwnerAttributeView.class);
        System.out.println("文件拥有者：" + fileOwnAttrs.getOwner());
    }
}
