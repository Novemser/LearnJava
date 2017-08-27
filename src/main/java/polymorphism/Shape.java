package polymorphism;

/**
 * Created by Novemser on 5/5/2016.
 */
public class Shape {
    public void draw() {
        System.out.println("Shape.draw");
    }

    public void erase() {
    }

    protected void withFinal() {
        System.out.println("Shape WithFinal");
    }
}
