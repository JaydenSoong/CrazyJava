package le06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by soong on 17-6-10.
 * 读取其它进程输出信息
 */
public class ReadFromProcess {
    public static void main(String[] args) {
        try {
            //运行 javac 命令，返回运行该命令的子进程
            Process p = Runtime.getRuntime().exec("javac");
            try (//以 p 进程的错误流来创建 BufferedReader 对象，这个错误流对本程序是输入流，对 p 进程则是输出流
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
                String buff;
                while ((buff = br.readLine()) != null) {
                    System.out.println(buff);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
