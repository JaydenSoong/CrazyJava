package classes;

interface InterfaceA {

    int PROP_A = 5;
    void testA();
}


interface InterfaceB {

    int PROP_B = 6;
    void testB();
}


interface InterfaceC extends InterfaceA, InterfaceB {

    int PROP_C = 7;
    void testC();
}


public class InterfaceExtendsTest {

    public static void main(String[] args) {
        System.out.println(classes.InterfaceA.PROP_A);
        System.out.println(classes.InterfaceB.PROP_B);
        System.out.println(classes.InterfaceC.PROP_C);
    }
}
