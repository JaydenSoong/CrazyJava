package synchronizedMethod;

/**
 * Created by soong on 17-6-26.
 * 同步方法
 */
public class Account {
    //封装账户编号、账户余额两个成员变量
    private String accountNo;
    private double balance;

    //构造器
    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    //提供一个线程安全的 draw() 方法来完成取钱操作
    synchronized void draw(double drawAmount) {
        //账户余额大于取钱数目
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //修改余额
            balance -= drawAmount;
            System.out.println("\t余额为：" + balance);
        } else {
            //账户余额小于取钱数目
            System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Double.compare(account.balance, balance) == 0 && (accountNo != null ? accountNo.equals(account.accountNo) : account.accountNo == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = accountNo != null ? accountNo.hashCode() : 0;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
