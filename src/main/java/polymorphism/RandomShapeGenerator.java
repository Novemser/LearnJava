package polymorphism;

import java.util.Random;

/**
 * Created by Novemser on 5/5/2016.
 */
public class RandomShapeGenerator {
    public Random rand = new Random(11);

    public Shape next() {
        switch (rand.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            default:
                return new Shape();
        }
    }
}
