package classes;

import java.util.Scanner;
import java.io.File;

public class ScannerFileTest {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(new File("D:\\codes\\java\\crazyjava\\cp07\\7.1\\src\\ScannerFileTest.java"));
        
        while(sc.hasNextLine()) {
           
            System.out.println(sc.nextLine());
        }

    }
}
