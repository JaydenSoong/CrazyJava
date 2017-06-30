package traditional;

/**
 * Created by soong on 17-6-30.
 * 传统的线程通信 —— 取钱线程
 */
public class DrawThread extends Thread{
    //模拟用户帐户
    private Account acct;
    //希望的取钱数
    private double drawAmount;

    DrawThread(String name, Account acct, double drawAmount) {
        super(name);
        this.acct = acct;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            acct.draw(drawAmount);
        }
    }
}
