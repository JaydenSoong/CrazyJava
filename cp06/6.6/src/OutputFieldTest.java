package jayden;


public class OutputFieldTest {

    public static void main(String[] args) {
        // 访问另一个包中的 Output 接口的 MAX_CACHE_LINE（证明是 public 修饰的）
        System.out.println(soong.Output.MAX_CACHE_LINE);
        // 错误: 无法为最终变量MAX_CACHE_LINE分配值
        // soong.Output.MAX_CACHE_LINE = 20;
        // 使用接口来调用类方法
        System.out.println(soong.Output.staticTest());
    }
}
