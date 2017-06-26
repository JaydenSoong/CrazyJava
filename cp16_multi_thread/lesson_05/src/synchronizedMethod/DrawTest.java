package synchronizedMethod;

/**
 * Created by soong on 17-6-26.
 * 同步方法
 */
public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("123456", 1000);

        new DrawThread("乙", acct, 700).start();
        new DrawThread("甲", acct, 700).start();
    }
}
