package classes;

/*
 * break 语句还可以用来结束外层循环。此时需要在 break 后面紧跟一个标签。
 * java 中的标签就是一个紧跟着英文冒号（:）的标识符
 */
public class BreakTest2{

    public static void main(String[] args) {
        // 外层循环，outer 作为标识符，是可以换成其它单词的
        outer:
        for(int i = 0; i < 5; i++){
            // 内层循环
            for(int j = 0; j < 3; j++){
                System.out.println("i = " + i + "; j = " + j);
                if(j == 1) {
                    // 跳出 outer 标签所标示的循环体
                    break outer;
                }
            }
        }
    }
}
