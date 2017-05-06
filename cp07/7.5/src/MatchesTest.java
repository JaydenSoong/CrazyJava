package classes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchesTest {

    public static void main(String[] args) {
        
        String[] mails = {"kongyeeku@163.com",
        "kongyeeku@gmail.com",
        "jiandongsong@nenu.edu.cn",
        "wawa@abc.xx",
        "liyang@crazyit.org"};
        String regexStr = "\\w{3,20}@\\w{2,20}\\.(com|cn|net|edu|org)(.cn)?";

        Pattern p = Pattern.compile(regexStr);
        Matcher m = null;

        for (String mail : mails) {
            if (m == null) {
                m = p.matcher(mail);
            } else {
                m.reset(mail);
            }

            String result = mail + (m.matches() ? " 是" : " 不是") + "一个有效的邮件地址";
            System.out.println(result);
        }
    }
}
