package classes;

public class RuntimeTest {

    public static void main(String[] args) {
        // 获取 Runtime 实例
        Runtime rt = Runtime.getRuntime();

        // 返回可用处理器的数目
        System.out.println(rt.availableProcessors());

        // 返回 Java 虚拟机中的空闲内存量。
        System.out.println(rt.freeMemory());

        // 返回 Java 虚拟机中的内存总量。
        System.out.println(rt.totalMemory());

        // 返回 Java 虚拟机试图使用的最大内存量。
        System.out.println(rt.maxMemory());

    }
}
