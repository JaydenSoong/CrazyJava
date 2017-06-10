package le07;

import java.io.*;

/**
 * Created by soong on 17-6-10.
 * RandomAccessFile 插入内容
 */
public class InsertContent {
    public static void main(String[] args) {
        insert("./src/le07/InsertContent.java", 15, "//这是新插入的一行\n");
    }

    private static void insert(String fileName, long pos, String insertContent) {
        try {
            //创建临时文件，用于缓冲插入点后面的内容
            File tmp = File.createTempFile("tmp", null);
            //退出JVM时，删除临时文件
            tmp.deleteOnExit();
            try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
                 //用于向临时文件中输出内容
                 FileOutputStream fos = new FileOutputStream(tmp);
                 //用于从临时文件中输入内容
                 FileInputStream fis = new FileInputStream(tmp)) {
                byte[] buf = new byte[64];
                int hasRead;
                //将指针移动到指定位置
                raf.seek(pos);
                //将指针之后的内容缓冲到临时文件中
                while ((hasRead = raf.read(buf)) > 0) {
                    fos.write(buf, 0, hasRead);
                }
                //将指针复位到指定位置
                raf.seek(pos);
                //在指定位置追加内容（相当于插入）
                raf.write(insertContent.getBytes());
                //将缓冲到临时文件中的内容追加回原文件中
                while ((hasRead = fis.read(buf)) > 0) {
                    raf.write(buf, 0, hasRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
