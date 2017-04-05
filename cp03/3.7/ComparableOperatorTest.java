package classes;

public class ComparableOperatorTest{
    
    public static void main(String[] args){

        System.out.println("5 是否大于 4.0：" + (5 > 4.0)); // 输出 true
        System.out.println("5 是否等于 5.0：" + (5 == 5.0)); // 输出 true
        System.out.println("97 是否等于 'a'：" + (97 == 'a')); // 输出 true
        System.out.println("true 是否等于 false：" + (true == false)); // 输出 false

        ComparableOperatorTest cot1 = new ComparableOperatorTest();
        ComparableOperatorTest cot2 = new ComparableOperatorTest();
        // 两个对象指向不同的引用，所以为 false
        System.out.println(cot1 == cot2);
        ComparableOperatorTest cot3 = cot1;
        // 两个对象指向相同的引用，所以为 true
        System.out.println(cot1 == cot3);
    }
}
