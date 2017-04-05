package classes;

public class AssignOperatorTest{

    public static void main(String[] args){

        // 为基本类型数据变量赋值
        String str = "Java";
        double d = 4.3;
        boolean b = false;

        // 连续赋值
        int a;
        int c;
        int f;
        a = c = f = 7;
        System.out.println("a = " + a + "\n\r" + "c = " + c + "\n\r" + "f = " + f);

        // 将表达式赋值给变量
        double d1 = 3.15;
        double d2 = d1 + a;
        System.out.println(d2);
    }
}
