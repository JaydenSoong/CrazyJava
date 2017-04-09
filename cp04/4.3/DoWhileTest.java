package classes;

public class DoWhileTest{

    public static void main(String[] args){
        // 定义变量 count
        int count = 1;

        // 执行 do while 循环
        do {
            System.out.println(count);
            // 循环迭代语句
            count ++;
            // 循环条件，这里的条件后需要加分号，表示循环结束。
        } while(count < 10);

        System.out.println("循环结束！");

        /*
         * do while 循环的循环体至少会被执行一次。
         * 下面的代码将会验证
         */
        // 定义变量 count2
        int count2 = 11;

        // 执行 do while 循环
        do {
            System.out.println(count2);
            // 循环迭代语句
            count2 ++;
            // 循环条件，这里的条件后需要加分号，表示循环结束。
        } while(count2 < 10);

        System.out.println("循环结束！");

    }
}
