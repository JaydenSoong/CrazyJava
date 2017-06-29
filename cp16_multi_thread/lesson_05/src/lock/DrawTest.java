package lock;

/**
 * Created by soong on 17-6-29.
 * 同步锁(Lock)
 */
public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("12345678", 1000);

        new DrawThread("Tom", acct, 600).start();
        new DrawThread("Jake", acct, 600).start();
    }
}
