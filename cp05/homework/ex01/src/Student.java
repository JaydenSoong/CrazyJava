package classes;


public class Student{
    private String name;
    private int age;
    private int gender;
    private String phone;
    private String address;
    private String email;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(int gender){
        this.gender = gender;
    }

    public int getGender(){
        return gender;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public Student(){
    }

    public Student(String name, int age, int gender, String phone, String address, String email){
        this.name = name;
        this.age = age; 
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    private void eat(){
        System.out.println("我在吃饭...");
    }

    private void drink(){
        System.out.println("我在喝东西...");
    }

    private void play(){
        System.out.println("我在玩耍...");
    }

    private void sleep(){
        System.out.println("我在睡觉...");
    }
}
