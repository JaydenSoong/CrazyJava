package classes;

public class ThreeTest{

    public static void main(String[] args){
        String str = 5 > 3 ? "5 大于 3" : "5 不大于 3";
        System.out.println(str);

        // 三目运算符等同于 if else 的简写
        String str2 = null;

        if(5 > 3)
            str2 = "5 大于 3";
        else
            str2 = "5 不大于 3";
        System.out.println(str2);

        // 三目运算符可嵌套。
        int a = 11;
        int b = 12;
        System.out.println(a > b ? "a 大于 b" : (a < b ? "a 小于 b" : "a 等于 b"));
    }
}
