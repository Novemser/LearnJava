package String;

import java.io.PrintStream;
import java.util.Formatter;
import java.util.Random;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2016/10/15
 */
public class UsingFormattor {
    public static void main(String...args) {
        PrintStream outAlias = System.err;
        Turtle nova = new Turtle("nova", new Formatter(System.out));
        Turtle ganser = new Turtle("GS", new Formatter(outAlias));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nova.move(random.nextInt() % 20 , 10 - i);
            ganser.move(2 * i, 10 - 2 * i);
        }
        // 返回formatter
        System.out.printf("").print("hi");
        // 返回void
        System.out.println();

    }
}

class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.formatter = formatter;
        this.name = name;
    }

    public void move(int x, int y) {
        formatter.format("%s is at (%d, %d)\n", name, x, y);
    }
}
