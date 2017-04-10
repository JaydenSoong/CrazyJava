package classes;

/*
 * return 语句用来结束一个方法
 */
public class ReturnTest{
    
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("i 的值是：" + i);
            if(i == 1){
                return;
            }
            System.out.println("return 后的输入语句");
        }
    }
}
