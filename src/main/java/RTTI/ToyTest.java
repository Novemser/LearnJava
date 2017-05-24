package RTTI;


import java.io.Serializable;

/**
 * Created by hugansen on 2016/10/31.
 */

class Toy {
    Toy() {}
    Toy(int i) {}
}

interface IShoot {
    boolean hehe();
}

class FancyToy extends Toy implements Serializable, IShoot {
    FancyToy() {super(1);}

    @Override
    public boolean hehe() {
        return false;
    }
}

@SuppressWarnings("all")
public class ToyTest {
    static void printInfo(Class c) {
        System.out.format("%-10s", "Simple:");
        System.out.format("%-1s\n", c.getSimpleName());
        System.out.format("%-10s", "Full:");
        System.out.printf("%-1s\n", c.getCanonicalName());

        System.out.println("====================================================");
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("RTTI.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);

        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(object.getClass());
    }
}
