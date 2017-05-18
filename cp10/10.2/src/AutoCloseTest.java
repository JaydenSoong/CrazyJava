package classes;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class AutoCloseTest {

    public static void main (String[] args) throws IOException {
        // 声明、初始化两个可关闭的资源，try 语句会自动关闭这两个资源
         try (BufferedReader br = new BufferedReader(new FileReader("src/AutoCloseTest.java"));
              PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))) {
             // 使用两个资源
              System.out.println(readTxt(br));
              ps.println("庄生晓梦迷蝴蝶");
         }     
    }

    /**
     * 将 BufferedReader 里的内容变成一个字符串
     */
    static String readTxt(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        return sb.toString();
    }
}
