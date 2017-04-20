package classes;

class Person{
    private String name;
    private String idStr;

    public Person(){}

    public Person(String name, String idStr){
        this.name = name;
        this.idStr = idStr;
    }

    public String getIdStr(){
        return idStr;
    }

    // 重写 equals() 
    public boolean equals(Object obj){
        // 若是同一个对象，返回 true
        if(this == obj){
            return true;
        }

        // 判断 obj 不为空，并且是 Person 的实例
        if(obj != null && obj.getClass() == Person.class){
            // 将 Object 对象转成 Person 对象
            Person personObj = (Person) obj;
            // id 号字符串相同则为同一个人
            if(personObj.getIdStr().equals(this.getIdStr())){
                return true;
            }
        }
        return false;
    }
}


public class OverrideEqualsRight{

    public static void main(String[] args){
        Person p1 = new Person("孙悟空", "8421");
        Person p2 = new Person("孙行者", "8421");
        Person p3 = new Person("者孙行", "8431");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
