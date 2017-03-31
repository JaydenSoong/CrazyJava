package classes;

public class BooleanTest{
    public static void main(String[] args){

        // 定义 b1 的值是 true
        boolean b1 = true;
        // 定义 b2 的值是 false
        boolean b2 = false;
        
        // 布尔类型的值和字符串进行连接运算，boolean 类型的值会自动转换成字符串
        String str = true + "";
        // 下面将输出 true
        System.out.println(str);
    }
}
