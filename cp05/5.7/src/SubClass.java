package classes;


class BaseClass{
    int book = 6;

    void base(){
        System.out.println("父类的普通方法");
    }
    void test(){
        System.out.println("父类的被覆盖的方法");
    }
}


class SubClass extends BaseClass{
    // 重新定义一个 book 实例变量，隐藏父类的同名实例变量
    String book = "苏菲的世界";

    void test(){
        System.out.println("子类覆盖父类的方法");
    }

    void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args){
        // 编译时类型和运行时类型一致。
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        // 编译时类型和运行时类型一致。
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.test();
        sc.sub();

        // 编译时类型和运行时类型不一致，多态发生。
        BaseClass polymophicBc = new SubClass();
        // 实例变量不具多态性，将输出父类的实例变量 6
        System.out.println(polymophicBc.book);
        // 调用父类的普通方法
        polymophicBc.base();
        // 运行时类型是 SubClass，因此调用子类的 test() 方法
        polymophicBc.test();
        // 下面的语句将出错，polymophicBc 的编译时类型是 BaseClass，该类型没有 sub() 方法
        // polymophicBc.sub();
    }
}
