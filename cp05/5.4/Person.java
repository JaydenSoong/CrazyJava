package classes;

public class Person{

    // 封装实例变量 name、age
    private String name;
    private int age;

    //提供 setter()、getter()
    public void setName(String name){
        int name_length = name.length();
        if(name_length > 6 || name_length < 2){
            System.out.println("您输入的姓名不合法");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age > 130 || age < 0){
            System.out.println("您输入的年龄不合法");
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}
