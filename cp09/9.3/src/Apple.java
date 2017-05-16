package classes;

public class Apple<T extends Number> {

    T col;

    public static void main(String[] args) {
        Apple<Integer> ai = new Apple<>();
        Apple<Double> ad = new Apple<>();
        // 下面代码将引发编译异常，下面代码试图将 String 类型传给 T 类型
        // 但 String 不是 Number 的子类型
        // Apple<String> as = new Apple<>();
    }
}
