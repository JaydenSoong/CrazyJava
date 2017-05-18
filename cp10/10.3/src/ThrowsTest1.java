package classes;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest1 {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");        
    }
}
