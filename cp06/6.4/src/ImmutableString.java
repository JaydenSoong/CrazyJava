package classes;

public class ImmutableString{

    public static void main(String[] args){
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        // false
        System.out.println(str1 == str2);
        // true
        System.out.println(str1.equals(str2));
        // 下面两次输出的 hashCode 相同
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
