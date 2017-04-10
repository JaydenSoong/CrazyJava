package classes;

/*
 * continue 语句还可以用来忽略标签所指定的循环中本次循环所剩下的语句。
 * java 中的标签就是一个紧跟着英文冒号（:）的标识符
 */
public class ContinueTest2{

    public static void main(String[] args) {
        // 外层循环，outer 作为标识符，是可以换成其它单词的
        outer:
        for(int i = 0; i < 5; i++){
            // 内层循环
            for(int j = 0; j < 3; j++){
                System.out.println("i = " + i + "; j = " + j);
                if(j == 1) {
                    // 忽略 outer 标签所指定的循环中本次循环所剩下的语句
                    break outer;
                }
            }
        }
    }
}
