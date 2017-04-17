package classes;


public class ScopeTest3{

    public static void main(String[] args){
        // 代码块局部变量作为循环变量——符合软件开发规范
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
