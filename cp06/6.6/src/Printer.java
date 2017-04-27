package classes;

import soong.Output;

interface Product {

    int getProductTime();
}


public class Printer implements Output, Product {

    private String[] printData = new String[MAX_CACHE_LINE];
    private  int dataNum;

    @Override
    public void out() {

        while (dataNum > 0) {
            System.out.println("打印机打印：" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }

    }

    @Override
    public void getData(String msg) {

        if(dataNum >= MAX_CACHE_LINE) {
            System.out.println("输出队列已满，添加失败");
        } else {
            printData[dataNum++] = msg;
        }
    }

    @Override 
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("疯狂 Java 讲义");
        o.getData("诗经");
        o.out();
        o.getData("平凡的世界");
        o.getData("目送");
        o.out();
        o.print("孙悟空", "猪八戒", "沙僧");
        o.test();
        
        Product p = new Printer();
        System.out.println(p.getProductTime());

        Object obj = p;
    }
}
