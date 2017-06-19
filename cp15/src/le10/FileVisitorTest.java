package le10;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by soong on 17-6-19.
 * 遍历文件和目录
 */
public class FileVisitorTest {
    public static void main(String[] args) throws Exception {
        Files.walkFileTree(Paths.get("."), new SimpleFileVisitor<Path> (){
            //访问文件时触发该方法
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问" + file + "文件");
                if (file.endsWith("FileVisitorTest.java")) {
                    System.out.println("---已经找到目标文件---");
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }
            //开始访问目录时触发该方法
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问：" + dir + " 路径");
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
