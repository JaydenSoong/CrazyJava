package classes;

public class EqualsTest{

    public static void main(String[] args){
        int it = 65;
        float ft = 65.0f;
        // true
        System.out.println("65 和 65.0 是否相等？" + (it == ft));

        char ch = 'A';
        // true
        System.out.println("65 和 'A' 是否相等？" + (it == 'A'));

        String str1 = new String("hello");
        String str2 = new String("hello");
        // false, 两个引用变量并不指向同一个对象
        System.out.println("str1 和 str2 是否相等？" + (str1 == str2));
        // true
        System.out.println("str1 和 str2 是的值否相等？" + (str1.equals(str2)));

        // 下面的语句将编译错误
        // 错误: 不可比较的类型: String和EqualsTest，没有继承关系
        // System.out.println("hello" == new EqualsTest());
    }
}
