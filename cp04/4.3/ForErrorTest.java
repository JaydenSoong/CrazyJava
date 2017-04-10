package classes;

public class ForErrorTest{

    public static void main(String[] args){
        for(int count = 0; count < 10; count++){
            System.out.println(count);
            // 再次修改了循环变量
            count *= .1;
        }
    }
}
