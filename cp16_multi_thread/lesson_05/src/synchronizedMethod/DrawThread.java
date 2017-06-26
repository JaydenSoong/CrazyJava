package synchronizedMethod;

/**
 * Created by soong on 17-6-26.
 * 同步方法
 */
public class DrawThread extends Thread {
    //模拟帐户
    private Account account;
    //取钱数目
    private double drawAmount;

    DrawThread (String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        /*
          直接调用 account 对象的 draw() 方法来执行取钱操作
          同步方法的同步监视器是 this, this 代表调用 draw() 方法的对象
          也就是说，线程进入 draw() 方法之前，必须先对 account 对象进行加锁
         */
        account.draw(drawAmount);
    }
}
