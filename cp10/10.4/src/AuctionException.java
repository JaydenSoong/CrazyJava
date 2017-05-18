package classes;

/**
 * 一个自定义异常
 * 自定义异常应该继承自 Exception 或 RuntimeException
 */
public class AuctionException extends Exception {
    // 自定义异常需要提供一个无参构造器
    public AuctionException(){}
    // 自定义异常需要提供一个带一个字符串参数的构造器
    public AuctionException(String msg) {
        super(msg);
    }
}
