package le09;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by soong on 17-6-16.
 * "多次取水"
 */
public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/le09/ReadFile.java");
             FileChannel fcin = fis.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(256);
            while (fcin.read(buffer) != -1) {
                //锁定 Buffer 的空白区
                buffer.flip();
                Charset charset = Charset.forName("utf8");
                //创建解码器
                CharsetDecoder decoder = charset.newDecoder();
                //将 ByteBuffer 的内容转码
                CharBuffer charBuffer = decoder.decode(buffer);
                System.out.println(charBuffer);
                //将 Buffer 初始化，为下一次读取数据作准备
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
