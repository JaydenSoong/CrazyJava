package classes;

/**
 * 饿汉模式——单例
 * 线程安全
 */
class Singleton{

    // 在类初始化时，已经自行实例化 
    private static Singleton instance = new Singleton();

    // 隐藏构造器
    private Singleton(){}

    // 对外提供获取实例的方法
    public static Singleton getInstance(){
        return instance;
    }
}


public class SingletonTest2{

    public static void main(String[] args){
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        System.out.println(st1 == st2);
    }
}
