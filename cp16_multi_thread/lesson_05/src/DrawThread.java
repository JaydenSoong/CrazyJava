/**
 * Created by soong on 17-6-20.
 * 取钱过程
 */
public class DrawThread extends Thread {
    //模拟帐户
    private Account account;
    //当前取钱线程所希望的取钱数
    private double drawAmount;

    DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    //当多个线程修改同一个共享数据时，将涉及数据安全问题
    @Override
    public void run() {
        if (account.getBalance() >= drawAmount) {
            //吐出钞票
            System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
            //修改余额
            account.setBalance(account.getBalance() - drawAmount);
            System.out.println("\t全额为：" + account.getBalance());
        } else {
            System.out.println(getName() + "取钱失败！余额不足！");
        }
    }
}
