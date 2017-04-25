package classes;

public class Address{

    private final String detail;
    private final String postCode;

    // 在构造器里初始化两个实例变量
    public Address(){
        this.detail = "";
        this.postCode = "";
    }

    public Address(String detail, String postCode){
        this.detail = detail;
        this.postCode = postCode;
    }

    // 仅为两个实例变量提供 getter 方法
    public String getDetail(){
        return detail;
    }

    public String getPostCode(){
        return postCode;
    }

    // 重写 equals 方法，判断两个对象是否相等
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj != null && obj.getClass() == Address.class){
            Address add = (Address) obj;
            // 当 detail 和 postCode 相等时，可以判定两个 Address 相等
            if(this.getDetail().equals(add.getDetail()) && 
                    this.getPostCode().equals(add.getPostCode())){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return detail.hashCode() + postCode.hashCode();
    }
}
