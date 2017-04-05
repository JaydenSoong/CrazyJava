package classes;

public class MathTest{
    
    public static void main(String[] args){
        double a = 3.2;

        // 求 a 的 5 次方，将输出 335.5443200000001 
        System.out.println(Math.pow(a, 5));

        // 求 a 的平方根，将输出 1.7888543819998317 
        System.out.println(Math.sqrt(a));

        // 计算一个随机数（0-1 之间）
        System.out.println(Math.random());

        // 计算 a 的 sin 值，将输出 -0.058374143427580086
        System.out.println(Math.sin(a));
    }
}
