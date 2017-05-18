package classes;

public class MultiExceptionTest {

    public static void main (String[] args) {
        try {
            int a = Integer.parseInt(args[0]); 
            int b = Integer.parseInt(args[1]); 
            int c = a / b;
            System.out.println("输入前两个参数相除的结果是：" + c);
        } catch(IndexOutOfBoundsException|
                NumberFormatException|
                ArithmeticException ie) {
            System.out.println("发生了数组越界、格式错误或算术异常");
            // 下面代码将引发错误，因为多种类型异常变量有隐式的 final
            // 修饰，不能重写赋值
            // ie = new ArithmeticException("test");
        } catch(Exception e) {
            System.out.println("未知异常");
            // 捕获一种类型异常时，异常变量没有 final 修饰
            e = new RuntimeException("test");
        }
    }
}
