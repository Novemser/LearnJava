package WTF;

public class Son extends Parent {

    // 子类的访问权限不能比父类的低啊……
    @Override
    public void fun2() {
        super.fun2();
    }

    @Override
    public void fun3() {
        super.fun3();
    }
}
