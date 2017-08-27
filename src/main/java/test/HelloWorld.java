package test;

import java.io.Serializable;

public class HelloWorld implements Comparable<HelloWorld>, CharSequence, Serializable {

    @Override
    public String toString() {
        return "你猜";
    }

    public static void main(String...args) {
//        System.out.println("Hello world!");
//        new test.HelloWorld().multiDimension();
//
//        List<test.HelloWorld> list = new ArrayList<>();
//
//        for (int i = 0; i < 22; i++) {
//            list.add(new test.HelloWorld());
//        }
//
//        Arrays.binarySearch(list.toArray(), 0, list.size() - 1, new Object(), (o1, o2) -> 1);
//
////        Arrays.parallelSort((test.HelloWorld[])list.toArray());
//        Integer integer = 88, int2 = new Integer(88);
//        Character ch = 'f';
//        ch++;
//        System.out.println(ch);
//
//        System.out.println(int2 == integer.intValue());

        StringBuilder sb = new StringBuilder();
        sb.append("Nova").append(":18").append(":Female").append(":Yooooooo");
        float f = 2000.20000f;
        double d = 2000.20000;
        System.out.format("%f %f", f, d);
    }

    public void multiDimension(){
        int [][] marks;
        marks = new int[10][99];

        for (int i = 0; i < 10; i++) {
            marks[i] = new int[i];
        }

        for (int[] ls : marks) {
            for (int ie : ls) {
                System.out.print(ie + " ");
            }
            System.out.println();
        }

    }

    @Override
    public int compareTo(HelloWorld o) {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
