package le09;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * Created by soong on 17-6-16.
 * ByteBuffer 和 CharBuffer 之间的转换
 */
public class CharsetTransform {
    public static void main(String[] args) {
        //创建简体中文对应的 Charset
        Charset cn = Charset.forName("GBK");
        //获取 cn 对应的编码器和解码器
        CharsetDecoder cnDecoder = cn.newDecoder();
        CharsetEncoder cnEncoder = cn.newEncoder();
        //创建一个 CharBuffer 对象
        CharBuffer cbuff = CharBuffer.allocate(8);
        cbuff.put('孙');
        cbuff.put('悟');
        cbuff.put('空');
        cbuff.flip();
        try {
            //将 CharBuffer 中的字符序列转换成字节序列
            ByteBuffer buffs = cnEncoder.encode(cbuff);
            for (int i = 0; i < buffs.capacity(); i++) {
                System.out.print(buffs.get(i) + " ");
            }
            //将 ByteBuffer 的数据解码成字符序列
            System.out.println("\n" + cnDecoder.decode(buffs));
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
    }
}
