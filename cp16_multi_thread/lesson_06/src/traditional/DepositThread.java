package traditional;

/**
 * Created by soong on 17-6-30.
 * 传统的线程通信 —— 存钱线程
 */
public class DepositThread extends Thread{
    //模拟帐户
    private Account account;
    //希望的存钱数
    private double depositAmount;

    DepositThread(String name, Account account, double depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run () {
        for (int i = 0; i < 100; i++) {
            account.deposit(depositAmount);
        }
    }
}
