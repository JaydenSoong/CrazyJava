package le05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by soong on 17-6-10.
 * 重定向输入流
 */
public class RedirectIn {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./src/le05/RedirectIn.java")){
            //将标准输入重定向到 fis 输入
            System.setIn(fis);
            //使用 System.in 创建 Scanner 对象，用于获取标准输入
            Scanner sc = new Scanner(System.in);
            //只把回车符作为分隔符
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                System.out.println("键盘输入的内容是：" + sc.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
