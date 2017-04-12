package classes;

public class ChenFaBiao{

    public static void main(String[] args){
        printChenFaBiao(9);
    }

    /**
     * 打印乘法表
     * @param num 需要打印乘法表的范围
     */
    public static void printChenFaBiao(int num){
        // 控制行
        for(int i = 1; i <= num; i++){
            // 控制列
            for(int j = 1; j <= i; j++) {
                // 打印的数字部分内容
                String content = i + "x" + j + " = " + (j * i);
                
                // 判断是否是每行最后一个，若是，则换行，若不是，则加逗号和制表符
                if(i == j){
                    System.out.print(content + "\r\n");
                } else {
                    System.out.print(content + ",\t");
                }
            }
        }
    }
}
