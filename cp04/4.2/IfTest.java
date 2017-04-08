package classes;

public class IfTest{

    public static void main(String[] args){
        int age = 30;

        if(age > 20){
            // 只有当 age > 20 时，下面括起来的代码块才会执行
            // 花括号括起来的语句是一个整体，要么一起执行，要么一起不执行。
            System.out.println("年龄已经大于 20 岁了！");
            System.out.println("20 岁以上的人应该学会承担责任...");
        }

        /*
         * 若条件语句后面的代码块只有一条语句，则花括号可以省略
         */
        int a = 5;
        if(a > 4)
            // 只有一行语句作为代码块
            System.out.println("a 大于 4");
        else
            // 只有一行语句作为代码块
            System.out.println("a 不大于 4");

        /*
         * 通常建议花括号不要省略。
         * 这样可以减少发生错误的可能。
         */
        int b = 5;
        if(b > 4)
            System.out.println("b 大于 4");
        else 
            b --;
            // 由于省略了花括号，下面语句已经不再是条件执行体的一部分。因此总是会被执行
            System.out.println("b 不大于 4");

        /*
         * 若 if 后有多条语句作为条件执行体，省略花括号则会引起编译错误
         */
        int c = 5;
        if(c > 4)
            c --;
        // 下面的语句总是会被执行
        System.out.println("c 大于 4");
        // 此处的 else 将没有 if。因此编译出错。
        else
            System.out.println("c 不大于 4");
    }
}
