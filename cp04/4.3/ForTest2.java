package classes;

public class ForTest2{

    public static void main(String[] args){
        // 同时定义了三个初始化变量。使用 && 来组合多个 boolean 表达式
        for(int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p ++){
            System.out.println(b ++);
            System.out.println(++ s + p);
            // 每循环一次 b，s，p 值的变化
            System.out.println("b = " + b + "\ts = " + s + "\tp = " + p);
            // 每循环一次空一行。
            System.out.println();
        }
    }
}

