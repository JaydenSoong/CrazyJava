package classes;

public class Primitive2String{
    
    public static void main(String[] args){
        String intStr = "123";
        // 把一个特定字符串转成 int 变量
        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);
        System.out.println(it2);

        String floatStr = "3.14";
        // 把一个特定字符串转成 float 变量
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        System.out.println(ft2);

        // 把一个 float 变量转换成 String 变量
        String ftStr = String.valueOf(2.13f);
        System.out.println(ftStr);

        // 把一个 double 变量转换成 String 变量
        String dbStr = String.valueOf(5.68);
        System.out.println(dbStr);

        // 把一个 boolean 变量转换成 String 变量
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

        // 通过连接运算符转成字符串
        String inS = 5 + "";
        System.out.println(inS);
    }
}
