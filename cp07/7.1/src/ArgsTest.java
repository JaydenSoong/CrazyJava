package classes;

public class ArgsTest {

    public static void main(String[] args) {
        
        // 输出 args 数组的长度
        System.out.println(args.length);

        // 遍历 args 数组
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
