package le06;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by soong on 17-6-10.
 */
public class WriteToProcess {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("java "+"ReadStandard");
            try (PrintStream ps = new PrintStream(p.getOutputStream())) {
                ps.println("普通字符串");
                ps.println(new WriteToProcess());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
