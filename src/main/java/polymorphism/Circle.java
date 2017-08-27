package polymorphism;

/**
 * Created by Novemser on 5/5/2016.
 */
public class Circle extends Shape {

    @Override
    public String toString() {
        return "{Name: Circle}";
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }
}
