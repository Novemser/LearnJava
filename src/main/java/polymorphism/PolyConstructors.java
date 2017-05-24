package polymorphism;

/**
 * Created by 20728 on 2016/5/7.
 */

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    private void duplicate() {
        System.out.println("Glyph.duplicate()");
    }

    Glyph() {
        System.out.println("Glyph() before draw");
        draw();// 动态绑定，调用子类覆盖的draw
        duplicate();// 非动态绑定，调用Glyph的duplicate
        System.out.println("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }

    public void duplicate() {
        // 这个duplicate和父类的duplicate没有任何关系
        // 不是Override
        // 因为父类的duplicate是private final的
        System.out.println("RoundGlyph.duplicate()");
    }
}

public class PolyConstructors {
    public static void main(String...args) {
        new RoundGlyph(10);
    }
}
