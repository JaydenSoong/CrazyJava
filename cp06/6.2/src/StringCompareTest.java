package classes;

public class StringCompareTest{

    public static void main(String[] args){
        String str1 = "疯狂Java";
        String str2 = "疯狂";
        String str3 = "Java";

        // str4 在编译时就可以确定，所以直接使用常量池的“疯狂Java”
        String str4 = "疯狂" + "Java";
        // str5 在编译时就可以确定，所以直接使用常量池的“疯狂Java”
        String str5 = "疯" + "狂" + "Java";
        // str6 编译时不能确定
        String str6 = str2 + str3;
        // str7 指向堆内存中的一个对象。
        String str7 = new String("疯狂Java");

        // true
        System.out.println(str1 == str4);
        // true
        System.out.println(str1 == str5);
        // false
        System.out.println(str1 == str6);
        // false
        System.out.println(str1 == str7);
    }
}
