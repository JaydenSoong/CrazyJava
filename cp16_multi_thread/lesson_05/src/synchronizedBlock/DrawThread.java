package synchronizedBlock;

/**
 * Created by soong on 17-6-22.
 * 同步代码块
 */
class DrawThread extends Thread{
    //模拟用户帐户
    private final Account account;
    //当前线程所希望的取钱数
    private double drawAmount;

    DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        /*
          使用 account 作为同步监视器，任何线程进入下面同步代码块之前，必须先获得对 account 帐户的锁定
          其它线程无法获得锁，也就无法修改它。这种做法符合“加锁——修改——释放锁”的逻辑
         */
        synchronized (account) {
            //帐户余额大余取钱数
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改余额
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t余额为：" + account.getBalance());
            } else {
                System.out.println(getName() + "取钱失败！余额不足!");
            }
        }
    }
}
