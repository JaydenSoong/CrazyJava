package classes;

public class ForInsteadWhile{

    public static void main(String[] args){
        // 将 for 循环的初始化条件定义在循环语句之外。
        int count = 0;

        // for 循环里只有循环条件
        for( ; count < 10; ){
            System.out.println(count);
            // 把循环迭代语句放在循环语句块里
            count ++;
        }

        System.out.println("循环结束");
    }
}
