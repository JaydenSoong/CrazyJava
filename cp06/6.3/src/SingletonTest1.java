package classes;

/**
 * 懒汉模式——单例
 * 线程不安全
 */
class Singleton{
    // 使用一个变量来缓存曾经建立的实例
    private static Singleton instance = null;

    // 隐藏构造器
    private Singleton(){}

    // 对外提供获取实例的方法
    public static Singleton getInstance(){
        if(instance == null){
           instance = new Singleton(); 
        }
        return instance;
    }
}


public class SingletonTest1{

    public static void main(String[] args){
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        System.out.println(st1 == st2);
    }
}
