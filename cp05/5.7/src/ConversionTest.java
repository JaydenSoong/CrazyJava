package classes;


public class ConversionTest{

    public static void main(String[] args){
        // 基本类型强制转换——必须是数值类型之间才可以
        double d = 3.14;
        long l = (long) d;
        System.out.println("l = " + l);

        int in = 5;
        // in 属于数值类型，但是 b 是布尔型，不能相互转换
        // 错误: 不兼容的类型: int无法转换为boolean
        // boolean b = (boolean) in;

        Object obj = "Hello";
        // obj 是 Object 类型的，Object 与 String 存在继承关系。并且 obj 的实际类型（运行时）是 String
        // 所以 obj 是可以转换成 String 类型的。
        String str = (String) obj;
        System.out.println(str);

        Object objPri = new Integer(4);
        // objPri 的编译时类型是 Object，运行时类型为 Integer，所以编译时，由于 Objcet 和 String 是有继承
        // 关系的，所以编译通过。但运行时类型 Integer 与 String 不存在继承关系。所以运行时会引发
        // ClassCastExcepthin 异常
        String strObj = (String) objPri;
    }
}
