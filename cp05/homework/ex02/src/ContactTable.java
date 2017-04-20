package classes;

public class ContactTable{

    // 一个班有 50 个学生
    private Student[] stuArr = new Student[50];

    /**
     * 初始化通讯录
     */
    private void setTable(){
        for(int i = 0; i < 50; i++){
            // 使用默认的无参构造器
            stuArr[i] = new Student();
        }
    }

    /**
     * 后期可以修改通讯录信息
     * @param i, 要更改学生的 ID 号。
     * @param stu, 学生信息。
     */
    private void modTable(int i, Student stu){
        for(int j = 0; j < 50; j++){
            // 不能有重名的学生，邮箱地址和电话号码也是不可以重复的
            if(stu.getName().equals(stuArr[j].getName()) || stu.getEmail().equals(stuArr[j].getEmail()) || stu.getPhone().equals(stuArr[j].getPhone())){
                System.out.println("记录重复");
                break;
            }
        }
        stuArr[i] = stu;
    }

    

    /**
     * 通过姓名查询学生
     * @param name, 需要查询的学生姓名
     */
    public void searchStudentByName(String name){
        // 是否能查到学生的标记
        int info = -1;

        // 查询过程
        for(int i = 0; i < 50; i++){
            if(name.equals(stuArr[i].getName())){
                // 查到的学生
                info = i;
            } 
        }

        if(info == -1) {
            System.out.println("你要查询的学生不存在，请重新输入");
        } else {
            System.out.println(name + "的信息：");
            System.out.println(stuArr[info].toString());
        }
    }

    /**
     * 通过邮箱查询学生
     * @param email, 需要查询的 Email 地址
     */
    public void searchStudentByEmail(String email){
        // 能否查到的标记
        int info = -1;

        for(int i = 0; i < 50; i++){
            if(email.equals(stuArr[i].getEmail())){
                info = i;
            } 
        }

        if(info == -1) {
            System.out.println("你要查询的学生不存在，请重新输入");
        } else {
            System.out.println("邮箱为 " + email + " 的学生的信息：");
            System.out.println(stuArr[info].toString());
        }
    }

    /**
     * 通过地址查询学生
     * @param address, 需要查询的地址。
     */
    public void searchStudentByAddress(String address){
        // 地址是可以重复的。所以可以定义一个临时数组，来存储查询结果
        Student[] withSameAdd = new Student[50];

        int count = 0;

        for(int i = 0; i < 50; i++){

            if(address.equals(stuArr[i].getAddress())){
                // 将查询到的学生添加到临时数组里
                withSameAdd[count] = stuArr[i];
                count++;
            }
        }
        
        if(count == 0) {
            System.out.println("你要查询的学生不存在，请重新输入");
        } else {
            System.out.println("来自" + address + "的学生：");
            for(int j = 0; j < count; j++){
                System.out.println(withSameAdd[j].toString());
            }
        }
    }

    private void drawLine(){
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args){
        ContactTable ct = new ContactTable();
        ct.setTable();
        ct.modTable(0, new Student("ZhangSan", 16, 1, "13665248974", "成都", "zhangsan@126.com"));
        ct.modTable(1, new Student("Lisi", 17, 1, "13985749515", "成都", "lisi@163.com"));
        ct.modTable(2, new Student("Wangwu", 16, 1, "13587453684", "成都", "Wangwu126@126.com"));
        ct.modTable(3, new Student("Wangwuli", 16, 1, "13587453684", "绵阳", "Wangwu12@126.com"));
        ct.searchStudentByName("Wangwu");
        ct.drawLine();
        ct.searchStudentByAddress("成都");
        ct.drawLine();
        ct.searchStudentByAddress("绵阳");
        ct.drawLine();
        ct.searchStudentByAddress("自贡");
        ct.drawLine();
        ct.searchStudentByEmail("lisi@163.com");
    }
}
