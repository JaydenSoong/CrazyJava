package classes;


public class CommandTest {
    private static int[] target = {2, -4, 6, 7, 9};

    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        // 第一次处理数组，处理行为取决于 PrintArray
        pa.process(target, new PrintArray());
        System.out.println("-------------------------");
        // 第二次处理数组，处理行为取决于 AddArray
        pa.process(target, new AddArray());
    }
}
