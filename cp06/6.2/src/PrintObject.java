package classes;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }
}


public class PrintObject {

    public static void main(String[] args){
        Person p = new Person("小明");
        System.out.println(p);
    }
    
}
