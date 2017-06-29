package lock;

/**
 * Created by soong on 17-6-29.
 * 同步锁(Lock)
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        account.draw(drawAmount);
    }
}
