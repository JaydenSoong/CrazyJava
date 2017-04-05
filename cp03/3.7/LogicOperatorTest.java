package classes;

public class LogicOperatorTest{

    public static void main(String[] args){
        System.out.println(!false); // true
        System.out.println(5 > 3 && '6' > 10); // true
        System.out.println(4 >= 5 || 'c' > 'a'); // true
        System.out.println(4 >= 5 ^ 'c' > 'a'); // true

        // | 与 || 的区别
        int a = 5; 
        int b = 10;
        if(a > 4 | b++ > 10) {
            // 输出 a = 5; b =11，说明 b++ 得到了运算。但实际上不需要运算，因为前一个条件已经满足。
            System.out.println("a = " + a + "; " + "b =" + b);
        }

        int c = 5; 
        int d = 10;
        if(c > 4 || d++ > 10) {
            // 输出 c = 5; d =10，说明 d++ 没有得到运算。
            System.out.println("c = " + c + "; " + "d =" + d);
        }
    }
}
