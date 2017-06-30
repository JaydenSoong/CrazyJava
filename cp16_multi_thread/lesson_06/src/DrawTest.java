/**
 * Created by soong on 17-6-30.
 * 传统的线程通信
 */
public class DrawTest {
    public static void main(String[] args) {
        //创建一个帐户
        Account account = new Account("13844855409", 0);

        new DrawThread("取钱者", account, 900).start();
        new DepositThread("存钱者甲", account, 900).start();
        new DepositThread("存钱者乙", account, 900).start();
        new DepositThread("存钱者丙", account, 900).start();
    }
}
