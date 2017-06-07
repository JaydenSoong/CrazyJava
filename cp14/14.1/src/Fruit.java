package classes;

public class Fruit {
    public void info () {
        System.out.println("这是水果的info方法");
    }
} 

class Apple extends Fruit {
    @Override
    public void info () {
        System.out.println("这是苹果的info方法");
    }
}
