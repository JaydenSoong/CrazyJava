package Student;

/**
 * Description:
 * <br>作用：描述学生
 * @author Jayden jiandongsong@126.com
 * @version 1.0
 *
 */
public class Student{
    /**
     * Description:
     * <br> 定义两个成员变量
     */
    private String name;
    private int age;

    /**
     * Description:
     * <br> main 方法，程序的入口
     * @param args, 字符串数组，规定写法
     */
    public static void main(String[] args){
        Student st = new Student("张三", 23);
        System.out.println(st.toString());
    }

    /**
     * 带两个参数的构造方法
     * @param name 学生姓名
     * @param age 学生年龄
     */
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * 重写父类 Object 的 toSting() 方法
     * @return String
     */
    @Override
    public String toString(){
        return "Student {姓名: " + this.name + ", 年龄: " + this.age + "}";
    }
}

