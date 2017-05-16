package classes;

public class ArrayErr {

    public static void main(String[] args) {
        // 定义一个 Integer 数组
        Integer[] ia = new Integer[5];
        // 可以把一个 Integer[] 数组赋值给一个 Number[] 变量
        Number[] na = ia;
        // 运行时异常
        // java.lang.ArrayStoreException:
        na[0] = .5;
    }
}
