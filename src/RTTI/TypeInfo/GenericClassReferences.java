package RTTI.TypeInfo;

/**
 * Project: LearnJava
 * Package: RTTI.TypeInfo
 * Author:  Novemser
 * 2016/11/11
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.TYPE;
        genericIntClass = Integer.class;
        intClass = double.class;
        // No good
        //genericIntClass = double.class;
        // Strange
        // Integer extends Number, but why can't work?
        //Class<Number> genericNumberClass = double.class;

    }
}
