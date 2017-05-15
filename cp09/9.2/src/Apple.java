package classes;

/**
 * Apple 是一个带泛型的类
 * 定义 Apple 类时使用了泛型声明
 */
public class Apple<T> {
    // 作用 T 类型形参定义实例变量
    private T info;
    
    public Apple(){}

    // 使用 T 类型形参来定义构造器
    public Apple(T info){
        this.info = info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public static void main(String[] args) {
        // 由于传给 T 形参的是 String，所以构造器参数只能是 String
        Apple<String> apple1 = new Apple<>("苹果");
        System.out.println(apple1.getInfo());

        // 由于传给 T 形参的是 Double，所以构造器参数只能是 Double 或 double（自动装箱）
        Apple<Double> apple2 = new Apple<>(3.14);
        System.out.println(apple2.getInfo());
    }
}
