package lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by soong on 17-6-29.
 * 同步锁(Lock)
 */
public class Account {
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    Account (String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void draw (double drawAmount) {
        lock.lock();
        try {
            if (balance > drawAmount) {
                System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println("\t余额为：" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
            }
        } finally {
            lock.unlock();
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
