/**
 * Created by soong on 17-6-30.
 * 传统的线程通信 —— 模拟帐户
 */
public class Account {
    private String accountNo;
    private double balance;
    //标识帐户中是否已有存款
    private boolean flag = false;

    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    synchronized void draw(double drawAmount) {
        try {
            //如果 flag 为假，表明帐户中还没有人存钱，取钱方法阻塞
            if (!flag) {
                wait();
            } else {
                //执行取钱操作
                System.out.println(Thread.currentThread().getName() + "取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("帐户余额为：" + balance);
                //将标记设为 false
                flag = false;
                //唤醒其它线程
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void deposit(double depositAmount) {
        try {
            //如果 flag 为真，表明帐户中还有钱，存钱方法阻塞
            if (flag) {
                wait();
            } else {
                //执行存钱操作
                System.out.println(Thread.currentThread().getName() + "存钱：" + depositAmount);
                balance += depositAmount;
                System.out.println("帐户余额为：" + balance);
                //将标记设为 true
                flag = true;
                //唤醒其它线程
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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
