package le09;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by soong on 17-6-15.
 * FileChannel 全部映射成 ByteBuffer
 */
public class ChannelTest {
    public static void main(String[] args) {
        File f = new File("./src/le09/ChannelTest.java");
        try (//创建 FileInputStream, 以该文件输入流创建 FileChanel
                FileChannel inChannel = new FileInputStream(f).getChannel();
                //以文件输出流创建 FileChannel, 用以控制输出
                FileChannel outChannel = new FileOutputStream("a.txt").getChannel()) {
            //将 FileChannel 里的全部数据映射成 ByteBuffer
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            //使用 utf8 字符集来创建解码器
            Charset charset = Charset.forName("utf8");
            //直接将 buffer 里的数据全部输出
            outChannel.write(buffer);
            //复原 limit、position 的位置
            buffer.clear();
            //创建解码器对象
            CharsetDecoder decoder = charset.newDecoder();
            //使用解码器将 ByteBuffer 转换成 CharBuffer
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.println(charBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
