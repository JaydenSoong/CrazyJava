package le04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by soong on 17-6-9.
 * 转换流、包装设计
 */
public class KeyInTest {
    public static void main(String[] args) {
        try (//将System.in对象转换成Reader对象
                InputStreamReader reader = new InputStreamReader(System.in);
                //将普通的Reader包装成BufferedReader对象
                BufferedReader br = new BufferedReader(reader)) {
            String line;
            //采用循环的方式读取
            while ((line = br.readLine()) != null) {
                //定义退出方式
                if (line.equals("exit")) {
                    System.exit(1);
                }
                System.out.println("输入的内容是：" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
