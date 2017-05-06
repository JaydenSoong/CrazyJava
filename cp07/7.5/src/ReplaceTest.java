package classes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplaceTest {
    
    public static void main(String[] args) {
        String[] msgs = {
            "Java has regular expressions in 1.8",
            "regular expressions is now expressing in Java",
            "Java represses orcular expresses",
            "rename it please"
        };

        String regexStr = "re\\w*";

        Pattern p = Pattern.compile(regexStr);
        Matcher m = null;

        for (String msg : msgs) {
            if(m == null) {
                m = p.matcher(msg);
            } else {
                m.reset(msg);
            }
            System.out.println(m.replaceAll("哈哈："));
        }
    }
}
