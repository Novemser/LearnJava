package polymorphism;

/**
 * Created by 20728 on 2016/5/7.
 */
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }

    PortableLunch(String what) {
        System.out.println("PortableLunch().what = " + what);
    }
}

public class Sandwich extends PortableLunch {
    private Lettuce lettuce = new Lettuce();
    private Bread bread = new Bread();

    public Sandwich() {
        super("Instant noodles");// @Version 2
        System.out.println("Sandwich()");
    }

    public static void main(String...args) {
        new Sandwich();
    }
}

/*
Output:
Version 1:
Meal()
Lunch()
PortableLunch()........初始化Sandwich()的基类
Lettuce()........初始化Sandwich()的成员变量
Bread()..........初始化Sandwich()的成员变量
Sandwich().......执行构造函数

Version 2:
Meal()
Lunch()
PortableLunch().what = Instant noodles.....通过Super显示调用带参数的构造函数
Lettuce()........不会影响先成员变量，后执行构造函数的顺序
Bread()
Sandwich()

Note:
Call of super must be the first statement of constructor.
 */