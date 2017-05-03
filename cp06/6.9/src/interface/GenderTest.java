package inter;


public class GenderTest {

    public static void main(String[] args) {
        Gender g = Gender.valueOf("MALE");
        System.out.println(g);
        g.info();
        //System.out.println(g + "代表：" + g.getName());
    }
}
