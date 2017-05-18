package classes;

public class DivTest {

    public static void main (String[] args) {
        try {
            int a = Integer.parseInt(args[0]); 
            int b = Integer.parseInt(args[1]); 
            int c = a / b;
            System.out.println("输入前两个参数相除的结果是：" + c);
        } catch(IndexOutOfBoundsException ie) {
            System.out.println("输入参数个数不够");
        } catch(NumberFormatException ne) {
            System.out.println("只能接受整数参数");
        } catch(ArithmeticException ae) {
            System.out.println("算术异常");
        } catch(Exception e) {
            System.out.println("未知异常");
        }
    }
}
