package classes;

import soong.Output;

class BetterPrinter implements Output {
    private String[] printData = new String[MAX_CACHE_LINE * 2];
    // 用以记录当前需要打印的作业数
    private int dataNum = 0;

    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE * 2) {
            System.out.println("打印队列已满");
        } else {
            printData[dataNum++] = msg; 
        }
    }

    public void out() {
        // 只要还有作业，就继承打印
        while(dataNum > 0) {
            System.out.println("高级打印机正在打印：" + printData[0]);
            // 把作业队列整体向前移一位，并将剩下的作业数减一。
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }
}
