package Emum;

import java.util.LinkedList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: Emum
 * Author:  Novemser
 * 2016/10/13
 */
public class UsingEnum {
    // implicitly extend java.lang.Enum
    // Enum can implement interface in Java. All Enum extends java.lang.Enum and compile time constant

    public enum DaysOfWeek {
        MONDAY("No", 2),
        TUESDAY("Noo", 4),
        WEDNESDAY("你猜"),
        THURSDAY("Bad"),
        FRIDAY("Aws"),
        SATURDAY("Well"),
        SUNDAY("so so"),
        ALLA;

        public String feeling;
        public int numId;
        // 构造函数必须是private
        DaysOfWeek(String feeling) {
            this(feeling, 10);
        }

        DaysOfWeek(String feeling, int num) {
            this.feeling = feeling;
            numId = num;
        }

        DaysOfWeek() {
            this("hehe~", -1);
        }

        public void nextDay() {
            System.out.println("next is always saturday");
        }

        @Override
        public String toString() {
            return super.toString() + " As we can";
        }
    }

    public static void feels(DaysOfWeek day) {
        System.out.println(day);
        switch (day) {
            case MONDAY:
                System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                break;
            case SATURDAY:
                System.out.println("YOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                break;
        }
    }

    public static void iterIt(DaysOfWeek day) {
        day.nextDay();
        for (DaysOfWeek d : DaysOfWeek.values()) {
            System.out.print(d.feeling + " ");
            System.out.println(d.numId);
        }
    }

    private List<Enum> list = new LinkedList<>();

    public static void main(String...args) {
        DaysOfWeek today = DaysOfWeek.MONDAY;

//        feels(today);
        iterIt(today);
    }
}
