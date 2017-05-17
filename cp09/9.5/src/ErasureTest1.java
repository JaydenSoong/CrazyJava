package classes;

class Apple<T extends Number> {
    T size;

    public Apple(){}

    public Apple(T size) {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getSize(){
        return size;
    }
}


public class ErasureTest1 {

    public static void main (String[] args) {
        Apple<Integer> a = new Apple<>(6);
        // a 的 getSize() 方法返回 Integer 对象
        Integer as = a.getSize();
        // 把 a 对象赋给 Apple 变量，丢掉尖括号里的类型信息
        Apple b = a;
        // b 只知道 size 的类型是 Number
        Number size1 = b.getSize(); 
        // 下面代码编译错误
        // Integer size2 = b.getSize(); 
    }
}
