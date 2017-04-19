package classes;


class Animal{
    // 不可以被继承
    private void beat(){
        System.out.println("心脏跳动...");
    }

    // 可以被继承
    public void breath(){
        beat();
        System.out.println("呼吸中...");
    }
}


class Bird extends Animal{
    public void fly(){
        System.out.println("我在天空中自由的飞翔...");
    }
}


class Wolf extends Animal{
    public void run(){
        System.out.println("我在地上快速的奔跑...");
    }
}


public class InheritTest{
    public static void main(String[] args){
        Bird b = new Bird();
        // 继承父类方法
        b.breath();
        b.fly();
        
        Wolf w = new Wolf();
        // 继承父类方法
        w.breath();
        w.run();
    }
}
