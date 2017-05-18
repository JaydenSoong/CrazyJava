package classes;

public class SalException extends Exception {
    public SalException(){}

    public SalException(String msg) {
        super(msg);
    }

    // 创建一个可以接收 Throwable 参数的构造器
    public SalException(Throwable t) {
        super(t);
    }
}
