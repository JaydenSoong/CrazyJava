package better;

public enum Gender {
    // 显示地列出所有枚举值
    MALE, FEMALE;

    // 用 private 封装 name 实例变量
    private String name;

    // 对外提供方法
    public void setName(String name) {

        switch(this) {
            case MALE:
                if(name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if(name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }
    }

    public String getName() {
        return this.name;
    }
}
