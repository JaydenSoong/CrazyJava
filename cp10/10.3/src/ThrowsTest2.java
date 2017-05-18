package classes;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest2 {

    public static void main (String[] args) throws Exception {
        // 因为 test() 方法声明抛出 IOException 异常
        // 所以调用该方法的代码要么处于 try...catch 块中
        // 要么处于另一个带 throws 声明抛出的方法中
        test();
    }

    public static void test() throws IOException {
        // 因为 FileInputStream 的构造器声明抛出 IOException 异常
        // 所以调用 FileInputStream 的代码要么处于 try...catch 块中
        // 要么处于另一个带 throws 声明抛出的方法中
        FileInputStream fis = new FileInputStream("a.txt");
    }
}
