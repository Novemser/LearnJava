package polymorphism;

/**
 * Created by Novemser on 5/5/2016.
 */
public class OverridingPrivate extends Shape {

    @Override
    public final void withFinal() {
        System.out.println("OverridingPrivate final");
    }
}
