package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

    public static void main(String[] args) {
        String str = "Java is Very esay!";
        System.out.println("需要查找的字符串是：" + str);
        // 创建一个 Pattern 对象，并用它建立一个 Matcher 对象
        Matcher m = Pattern.compile("\\w+").matcher(str);
        while (m.find()) {
            System.out.println("找到的子串：" + m.group() + 
                    "，开始位置：" + m.start() + "，结束位置：" + m.end());
        }
    }
}
