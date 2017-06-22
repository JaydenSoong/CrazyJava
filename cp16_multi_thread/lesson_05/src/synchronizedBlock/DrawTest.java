package synchronizedBlock;

/**
 * Created by soong on 17-6-22.
 * 同步代码块
 */
public class DrawTest {
    public static void main(String[] args) {
        //创建一个帐户
        Account acct = new Account("1234567", 1000);
        //模拟两个线程对同一个账户取钱
        new DrawThread("张", acct, 800).start();
        new DrawThread("王", acct, 800).start();
    }
}
