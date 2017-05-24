package polymorphism;

/**
 * Created by Novemser on 5/5/2016.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String...args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
