package classes;

import java.util.Arrays;

class Person{
    private int age;

    Person(){}

    Person(int age){
        this.age = age;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }
}


public class FinalReferenceTest {

    public static void main(String[] args){
        // 定义一个 final 修饰的数组变量（引用变量）
        final int[] iArr = {23, 32, 1, 4};
        System.out.println(Arrays.toString(iArr));
        // 升序排序（会改变数组）
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        // 对数组元素重新赋值
        iArr[1] = 0;
        System.out.println(Arrays.toString(iArr));
        // 编译错误: 无法为最终变量iArr分配值，final 修饰的变量，一旦有值了，就不能重新赋值
        // iArr = null;

        // 定义一个 final 修饰的 Person 变量（引用变量）
        final Person p = new Person(43);
        p.setAge(32); 
        System.out.println(p.getAge());
        // 编译错误: 无法为最终变量p分配值，final 修饰的变量，一旦有值了，就不能重新赋值
        // p = null;
    }
}
