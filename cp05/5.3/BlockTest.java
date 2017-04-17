package classes;


public class BlockTest{
    
    public static void main(String[] args){
        {
            // 定义代码块局部变量 a
            int a;
            // BlockTest.java:10: 错误: 可能尚未初始化变量a
            // System.out.println(a);
            a = 5;
            System.out.println(a);
        }
        
        // 在代码块外访问方法局部变量——错误。
        // System.out.println(a);
    }
}
