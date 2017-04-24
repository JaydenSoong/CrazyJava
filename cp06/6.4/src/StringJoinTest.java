package classes;

public class StringJoinTest{

    public static void main(String[] args){
        String s1 = "疯狂Java";
        // s2 变量引用字符串在编译时就可以被确定下来
        // 因此 s2 直接引用常量池中已有的“疯狂Java”
        String s2 = "疯狂" + "Java";
        System.out.println(s1 == s2);
        // 定义两个字符串直接量
        String str1 = "疯狂";
        String str2 = "Java";
        // 连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }
}
