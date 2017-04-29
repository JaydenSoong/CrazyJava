package classes;


public interface Command {
    // 接口里定义的 process 方法，用于封装“处理行为”
    void process(int[] target);
}
