package classes;

/*
 * break 语句用于完全结束一个循环，跳出循环体
 */
public class BreakTest{

    public static void main(String[] args) {
        // 一个 for 循环
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            if(i == 2){
                // 执行该语句将跳出循环体
                break;
            }
        }
    }
}
