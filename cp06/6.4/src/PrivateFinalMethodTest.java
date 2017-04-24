package classes;

public class PrivateFinalMethodTest{

    private final void test(){}
}


class Sub extends PrivateFinalMethodTest{
    // 下面的方法定义不会出现问题
    public void test(){}
}

