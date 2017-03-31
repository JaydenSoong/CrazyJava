package classes;

public class CharTest{
    public static void main(String[] args){
        //直接定义单个字符作为字符值
        char a = 'a';
        //定义转义字符作为字符值
        char b = '\r';
        //定义 Unicode 作为字符值
        char c = '\u9999';
        System.out.println(c);
        //定义中文字符作为字符值
        char d = '宋';
        //直接将一个 char 变量作为一个 int 变量使用，自动转换
        int i = d;
        //将一个 int 数值赋给一个 char 变量
        char e = 97;
        System.out.println(e);
    }
}
