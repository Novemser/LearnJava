package RTTI.TypeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: RTTI.TypeInfo
 * Author:  Novemser
 * 2016/11/11
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

abstract class Test extends Number {
    @Override
    public String toString() {
        System.out.println("Abstract class can override super method...");
        double useLess = double.class.cast(1);
        return Double.toString(useLess);
    }

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        bounded = Integer.class;
        bounded = Double.TYPE;
        bounded = Test.class;
    }
}

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++)
                result.add(type.getDeclaredConstructor().newInstance(i));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static void main(String[] args) {
        FilledList<Integer> list =
                new FilledList<>(Integer.class);
        FilledList<CountedInteger> fl =
                new FilledList<>(CountedInteger.class);

        System.out.println(list.create(14));
    }
}
