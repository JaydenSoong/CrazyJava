package classes;

public class ExecTest {

    public static void main(String[] args) throws Exception {
        // 获取 Runtime 实例
        Runtime rt = Runtime.getRuntime();
        // 通过 exec() 方法在单独的进程中执行指定的字符串命令。
        rt.exec("notepad.exe");
    }
}
