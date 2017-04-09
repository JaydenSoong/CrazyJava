package classes;

public class WhileTest{

    public static void main(String[] args){
        // 循环的初始化条件
        int count = 0;

        // 当 count 小于 10 时，执行循环体
        while(count < 10){
            System.out.println(count);
            // 迭代语句
            count ++;
        }

        System.out.println("循环结束！");

        /*
         * 死循环演示
         */

        /*
         * int num = 0;
         * while(num < 10){
         *     System.out.println("不停的执行循环体");
         *     num --;
         * }
         */

        /*
         * 错误的在 while 循环条件中加分号
         * 采用标准的格式——将左大括号放在条件后面，不换行。不容易引发这种错误
         */
        int num = 0;
        while(num < 10);
        {
            System.out.println("------" + num);
            num ++;
        }
    }
}
