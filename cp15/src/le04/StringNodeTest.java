package le04;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by soong on 17-6-9.
 * 使用字符串作为物理节点
 */
public class StringNodeTest {
    public static void main(String[] args) {
        String src = "从明天起, 做一个幸福的人 \n" +
                "喂马, 劈柴, 周游世界 \n" +
                "从明天起, 关心粮食和蔬菜 \n" +
                "我有一所房子, 面朝大海, 春暖花开  \n" +
                "从明天起, 和每一个亲人通信 \n" +
                "告诉他们我的幸福 \n" +
                "那幸福的闪电告诉我的 \n" +
                "我将告诉每一个人 \n" +
                "给每一条河每一座山取一个温暖的名字 \n" +
                "陌生人, 我也为你祝福 \n" +
                "愿你有一个灿烂的前程 \n" +
                "愿你有情人终成眷属 \n" +
                "愿你在尘世获得幸福 \n" +
                "而我只愿面朝大海, 春暖花开\n";
        char[] buf = new char[32];
        int hasRead;
        try (StringReader sr = new StringReader(src)) {
            //采用循环的方式读取字符串
            while ((hasRead = sr.read(buf)) > 0) {
                System.out.print(new String(buf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (StringWriter sw = new StringWriter()) {
            sw.write("有一个美丽的新世界\n");
            sw.write("它在远方等我\n");
            sw.write("那里有天真的孩子\n");
            sw.write("还有姑娘的酒窝\n");
            sw.write("有一个美丽的新世界\n");
            sw.write("叫我慢慢的走\n");
            sw.write("海浪它总是一波波\n");
            sw.write("不停歇不回头");
            System.out.println("------下面是sw字符串输出的内容------");
            System.out.println(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
