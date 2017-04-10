package classes;

/*
 * continue 语句用于跳出一次循环
 */
public class ContinueTest{

    public static void main(String[] args) {
        // 一个 for 循环
        for(int i = 0; i < 10; i++){
            System.out.println("i 的值是：" + i);
            if(i == 1){
                // 执行该语句将跳出该次循环
                continue;
            }
            System.out.println("continue 后的输出语句");
        }
    }
}
