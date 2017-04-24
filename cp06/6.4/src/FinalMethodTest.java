package classes;

public class FinalMethodTest{

    public final void test(){}
}


class Sub extends FinalMethodTest{
    // 编译错误: Sub中的test()无法覆盖FinalMethodTest中的test()，
    // 被覆盖的方法为final
    public void test(){}
}

