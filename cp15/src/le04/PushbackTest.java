package le04;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * Created by soong on 17-6-9.
 * 推回输入流
 */
public class PushbackTest {
    public static void main(String[] args) {
        try (//创建一个PushbackReader对象，指定推回缓冲区的长度为64
                PushbackReader pr = new PushbackReader(
                new FileReader("./src/le04/PushbackTest.java"), 64)) {
            char[] buf = new char[32];
            //用以保存上次读取的字符串
            String lastContent = "";
            int hasRead;
            //循环读取文件内容
            while ((hasRead = pr.read(buf)) > 0) {
                //将读取的内容转换成字符串
                String content = new String(buf, 0, hasRead);
                int targetIndex;
                //将上次读取的内容和本次读取的内容拼起来，查看是否包含目标字符串
                if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
                    //将本次的内容和上次的内容一起推回缓冲区
                    pr.unread((lastContent + content).toCharArray());
                    //修改buf长度为targetIndex
                    if (targetIndex > 32) {
                        buf = new char[targetIndex];
                    }
                    //再次读取指定长度的内容
                    pr.read(buf, 0, targetIndex);
                    System.out.println(new String(buf, 0, targetIndex));
                    System.exit(0);
                } else {
                    System.out.println(lastContent);
                    lastContent = content;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
