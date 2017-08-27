package polymorphism;

/**
 * Created by Novemser on 5/5/2016.
 */
public class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw");
    }

    public void erase() {
        System.out.println("Triangle.erase");
    }
}
