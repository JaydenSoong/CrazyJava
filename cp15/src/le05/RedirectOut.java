package le05;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by soong on 17-6-10.
 * 重定向输出流
 */
public class RedirectOut {
    public static void main(String[] args) {
        try (//创建PrintStream输出流
                PrintStream ps = new PrintStream("out.txt")) {
            //将标准输出重定向到ps输出流
            System.setOut(ps);
            System.out.println("普通字符串");
            System.out.println(new RedirectOut());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
