package polymorphism.music3;

/**
 * Created by 20728 on 2016/5/7.
 */

enum Note {
    MIDDLE_C,
    C_SHARP,
    B_FLAT
}

class Instrument {
    public int field = 0;

    void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjust Instrument");
    }
}

class Wind extends Instrument {
    public int field = 1;

    @Override
    void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Wind");
    }
}

class Brass extends Wind {
    @Override
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    void adjust() {
        System.out.println("Adjust Brass");
    }
}

public class Music3 {

    public static void tune(Instrument instrument) {
        instrument.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
            System.out.println(instrument.field);
        }
    }

    public static void main(String... args) {
        Instrument[] orchestra = {
                new Wind(),
                 new Brass()
        };
        tuneAll(orchestra);
    }

}

/*
多态的好处就是不用改tune, tuneAll也可以
添加新的Instrument类

任何域访问操作都不是多态的
 */