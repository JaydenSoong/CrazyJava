package classes;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
import java.util.Arrays;

public class StringReg {
    
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.8",
            "regular expressions is now expressing in Java",
            "Java represses orcular expresses",
            "rename it please"
        };
        
        for(String msg : msgs) {
            System.out.println(msg.replaceFirst("re\\w*", "哈哈："));
            System.out.println(Arrays.toString(msg.split(" ")));
        }
    }
}
