package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowTest2 {
    public static void main (String[] args) 
        // Java 7 以前的版本认为抛出自定义异常的类型是Exception
        // throws Exception {

        // Java 7 会检查自定义抛出异常的类型，所以此处只需抛出FileNotFoundException异常即可。
        throws FileNotFoundException {
        try {
            new FileInputStream("b.txt");
        } catch(Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
