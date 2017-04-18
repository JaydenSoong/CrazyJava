package classes;


class Base{
    double size;
    String name;
    
    // 父类构造器
    Base(double size, String name){
        this.size = size;
        this.name = name;
    }
}


public class Sub extends Base{
    String color;
    // 子类构造器
    Sub(double size, String name, String color){
        // 通过 super 来调用父类构造器的初始化过程
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args){
        Sub s = new Sub(5.76, "测试对象", "红色");
        System.out.println(s.size + "----" + s.name + "----" + s.color);
    }
}
