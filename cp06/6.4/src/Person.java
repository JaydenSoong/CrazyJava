package classes;

class Name{

    private String firstName;
    private String lastName;

    public Name(){}

    public Name(String firstName, String lastName){
        this.firstName = firstName; 
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }
}


public class Person {

    private final Name name;
    
    public Person(Name name){
        // this.name = name;
        // 设置 name 实例变量为临时创建的 Name 对象，该对象的 firstName
        // 和 lastName 与传入的 name 参数的 firstName 和 lastName 相同
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName(){
        //return name;
        // 返回一个匿名对象，该对象的 firstName 和 lastName 与该对象里的
        // name 的 firstName 和 lastName 相同
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args){
        Name n = new Name("悟空", "孙");
        Person p = new Person(n);
        System.out.println(p.getName().getFirstName());
        n.setFirstName("八戒");
        System.out.println(p.getName().getFirstName());
    }
}
