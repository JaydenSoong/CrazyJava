package le06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by soong on 17-6-10.
 * 标准输入
 */
public class ReadStandard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                ps.println("键盘的输入内容是：" + sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
