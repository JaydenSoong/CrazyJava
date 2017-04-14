package classes;


/**
 * DataWrap 类，只有两个成员变量 a、b
 */
class DataWrap{
    int a;
    int b;
}


public class ReferenceTransferTest{

    public static void swap(DataWrap dw){

        // 交换过程
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("swap 方法里，dw 的成员变量 a 的值是：" + dw.a + "，成员变量 b 的值是：" + dw.b);
    }

    public static void main(String[] args){
    
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("swap 方法结束后，dw 的成员变量 a 的值是：" + dw.a + "，成员变量 b 的值是：" + dw.b);
    }
}
