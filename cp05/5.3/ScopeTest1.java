package classes;


public class ScopeTest1{

    // 定义一个类变量作为循环变量
    private static int i = 0;

    public static void main(String[] args){
       for(; i < 10; i++){
           System.out.println(i);
       } 
    }
}
