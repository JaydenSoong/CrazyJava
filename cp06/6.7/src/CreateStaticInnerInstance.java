package classes;


class Out {

    static class StaticIn {
        
        public StaticIn() {
            System.out.println("静态内部类的构造器");
        }
    }
} 


public class CreateStaticInnerInstance {

    public static void main(String[] args) {
        Out.StaticIn osi = new Out.StaticIn();
        /*
         * 上面代码可以改为如下两行
         * 使用 OuterClass.InnerClass 的形式来定义变量
         * Out.StaticIn osi;
         * 通过 new 来调用内部类构造器创建静态内部类实例
         * osi = new Out.StaticIn();
         */
    }
}
