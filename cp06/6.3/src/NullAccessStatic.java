package classes;

public class NullAccessStatic{

    private static void test(){
        System.out.println("类的静态方法");
    }

    public static void main(String[] args){
        NullAccessStatic ns = null;
        ns.test();
    }
}
