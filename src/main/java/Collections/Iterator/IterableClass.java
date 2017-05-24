package Collections.Iterator;

import java.util.Iterator;

/**
 * Project: LearnJava
 * Package: Collections.Iterator
 * Author:  Novemser
 * 2016/10/8
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And this is how wo draw the " +
            "Conclusion that One Brother is a SB").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            // iteration for array is acceptable
            public void forEachTest() {
                for (String s : words) {
                    System.out.println(s);
                }
            }
        };
    }

    public static void main(String...args) {
        IterableClass iterableClass = new IterableClass();
        for (String str : iterableClass) {
            System.out.println(str);
        }
    }
}
