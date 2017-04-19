package classes;


class Animal{

    private void beat(){
        System.out.println("心脏跳动...");
    }

    public void breath(){
        beat();
        System.out.println("呼吸中...");
    }
}


class Bird{
    // 通常，在新类里使用 private 修饰被组合的对象
    private Animal a;

    // 把旧类的对象作为新类的成员变量组合进来
    public Bird(Animal a){
        this.a = a;
    }

    // 直接利用旧类对象的 breath() 方法
    public void breath(){
        a.breath();
    }

    public void fly(){
        System.out.println("我在天空中自由的飞翔...");
    }
}


class Wolf{
    // 通常，在新类里使用 private 修饰被组合的对象
    private Animal a;

    // 把旧类的对象作为新类的成员变量组合进来
    public Wolf(Animal a){
        this.a = a;
    }

    // 直接利用旧类对象的 breath() 方法
    public void breath(){
        a.breath();
    }

    public void run(){
        System.out.println("我在地上快速的奔跑...");
    }
}


public class CompositeTest{
    public static void main(String[] args){
        // 先要显示地创建被组合的对象
        Animal a = new Animal();
        Bird b = new Bird(a);
        // 继承父类方法
        b.breath();
        b.fly();
        
        Wolf w = new Wolf(a);
        // 继承父类方法
        w.breath();
        w.run();
    }
}

