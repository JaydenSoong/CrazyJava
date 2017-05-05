package classes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindGroup {

    public static void main(String[] args) {
        String str = "我想买一本《疯狂 Java 讲义》，尽快联系我 13844855409"
            + "交朋友，电话号码是 18982389001"
            + "装房子，买家具请找 15745998932";

        // 创建一个 Pattern 对象，并用它创建一个 Matcher 对象。
        // 该正则用于抓取电话号码
        Matcher m = Pattern.compile("1[358]\\d{9}").matcher(str);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
